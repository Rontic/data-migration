package com.gyenno.ruiyun.datamigration.task;

import com.alibaba.fastjson.JSON;
import com.gyenno.ruiyun.datamigration.model.patient.*;
import com.gyenno.ruiyun.datamigration.model.util.TableId;
import com.gyenno.ruiyun.datamigration.model.util.TableStringId;
import com.gyenno.ruiyun.datamigration.service.patient.AddDataService;
import com.gyenno.ruiyun.datamigration.service.patient.PatientService;
import com.gyenno.ruiyun.datamigration.service.user.UserService;
import com.gyenno.ruiyun.datamigration.service.util.TableIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

@Component//被spring容器管理
@Order(1)
public class MigrationApplicationRunner implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private TableIdService tableIdService;

    @Autowired
    private AddDataService addDataService;

    private final static Logger logger = (Logger) LoggerFactory.getLogger(MigrationApplicationRunner.class);

    private static TableId tableId;

    private static TableStringId tableStringId  = new TableStringId();

    private static HashMap<Integer,Integer> dependentsDiff = new HashMap<>();


    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("-------------->" + "确定开始迁移数据吗？(Y/N)" + new Date());
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //利用nextXXX()方法输出内容
            String str = sc.next();
            if (str.equals("Y")) {
                tableId = getAloneId();
                myTimer();
            }
        }
    }

    public void myTimer(){

        logger.info("正在查询单机版数据......");
        List<PatientWholeInfo> patientAloneWholeInfoList = patientService.getAlonePatientWholeInfo();

        logger.info("数据查询完毕，开始处理数据");
        dealAloneData(patientAloneWholeInfoList);

        logger.info("开始插入数据");
        addDataService.insetWholeData(patientAloneWholeInfoList);

        logger.info("迁移完毕");
    }

    public TableId getAloneId(){
        String[] tableArray = {
                "tc_patient_info",
                "tc_patient_case",
                "tc_patient_scale",
                "tc_patient_option",
                "tc_patient_disease_order",
                "tc_patient_medhistory",
                "tc_patient_habit",
                "tc_patient_history",
                "tc_patient_first_symbol",
                "tc_patient_disease",
                "tc_patient_allergy",
                "tc_family_history",
                "tc_cideexposed_history",
                "tc_patient_dependents",
                "tc_accompanying_diagnosis",
                "tc_patient_paperoption",
                "tc_patient_diary",
                "tc_patient_disease_complication",
                "tc_patient_symptom",
                "tc_patient_medicine",
                "tc_patient_medicine_detail",
                "tc_patient_combine_medicine",
                "tc_patient_combine_medicine_detail",
                "tc_patient_video_info",
                "t_s_attachment",
                "tc_patient_gait",
                "tc_patient_gait_item",
                "tc_patient_gait_check",
                "tc_pat_elec_tro_gram",
                "tc_patient_mot_ner_cond_resu",
                "tc_patient_f_wav_stu_resu",
                "tc_patient_sen_ner_cond_resu",
                "tc_patient_need_exam_resu",
                "tc_patient_mot_uni_ana_resu",
                "tc_patient_int_pat_ana_item",
                "tc_patient_field_detail",
                "tc_patient_nerve_sleep",
                "tc_patient_inspect",
                "tc_patient_bioexam",
                "tc_bioexam_result",
                "tc_patient_gene_mutation_info",
                "tc_patient_bodypart",
                "tc_patient_vital_sign",
                "tc_patient_vital_sign_detail",
                "tc_patient_phythe_reaction",
                "tc_patient_phythe_tms",
                "tc_patient_phythe_assess",
                "tc_patient_adverse",
                "tc_patient_preops_info",
                "tc_patient_preops_diary",
                "tc_patient_preops_scale",
                "tc_patient_preops_medicine",
                "tc_patient_treatment",
                "tc_patient_complication",
                "tc_patient_dbs_first",
                "tc_patient_dbs_follow",
                "tc_patient_dbs_first_detail",
                "tc_patient_dbs_medicine",
                "tc_patient_dbs_choose",
                "tc_patient_dbs_parameter",
                "tc_patient_scale_file",
                "tc_patient_adverse_medicine",
                "tc_patient_adverse_serious",
                "tc_patient_first_visit_treatment",
                "tc_patient_exercise",
                "tc_patient_medicine_adverse",
                "patient_medicine_adverse_md",
                "tc_patient_spephysical"
        };

        TableId tableId = new TableId();
        //int
        tableId.setPatientInfoId(tableIdService.getTableId(tableArray[0]));
        //string 402819816251bb18016251bb18800000
        tableId.setPatientCaseId(1);
        //int
        int tempId = tableIdService.getTableId(tableArray[2]);
        tableId.setPatientScaleId(tableIdService.getTableId(tableArray[2]));
        //int
        tableId.setPatientOptionId(tableIdService.getTableId(tableArray[3]));
        //int
        tableId.setPatientDiseaseOrderId(tableIdService.getTableId(tableArray[4]));
        //string 40288086660fc90601662958a7923e61
        tableId.setPatientMedhistoryId(1);

        //int
        tableId.setPatientHabitId(tableIdService.getTableId(tableArray[6]));
        //int
        tableId.setPatientHistoryId(tableIdService.getTableId(tableArray[7]));
        //int
        tableId.setPatientFirstSymbolId(tableIdService.getTableId(tableArray[8]));
        //int
        tableId.setPatientDiseaseId(tableIdService.getTableId(tableArray[9]));
        //int
        tableId.setPatientAllergyId(tableIdService.getTableId(tableArray[10]));
        //int
        tableId.setPatientFamilyHistoryId(tableIdService.getTableId(tableArray[11]));
        //int
        tableId.setPatientCideexposedHistoryId(tableIdService.getTableId(tableArray[12]));
        //int
        tableId.setPatientDependentsId(tableIdService.getTableId(tableArray[13]));
        //int
        tableId.setPatientAccompanyingDiagnosisId(tableIdService.getTableId(tableArray[14]));
        //int
        tableId.setPatientPaperoptionId(tableIdService.getTableId(tableArray[15]));
        //int
        tableId.setPatientDiaryId(tableIdService.getTableId(tableArray[16]));
        //int
        tableId.setPatientDiseaseComplicationId(tableIdService.getTableId(tableArray[17]));
        //int
        tableId.setPatientSymptomId(tableIdService.getTableId(tableArray[18]));
        //int
        tableId.setPatientMedicineId(tableIdService.getTableId(tableArray[19]));
        //int
        tableId.setPatientMedicineDetailId(tableIdService.getTableId(tableArray[20]));
        //int
        tableId.setPatientCombineMedicineId(tableIdService.getTableId(tableArray[21]));
        //int
        tableId.setPatientCombineMedicineDetailId(tableIdService.getTableId(tableArray[22]));

        tableId.setPatientVideoInfoId(tableIdService.getTableId(tableArray[23]));

        //tring 402816815fb3bbae015fb3bbae7a0000
        tableId.setPatientAttachmentId(tableIdService.getTableId(tableArray[24]));

        //string 40288084670cb97a01670fefc10a0045
        tableId.setPatientGaitId(1);
        //string 40288084670cb97a01670fefc10e0046
        tableId.setPatientGaitItemId(1);
        //string 40288084670cb97a01670fefc10e0047
        tableId.setPatientGaitCheckId(1);
        //string 8a9e2d385fc55273015fc8a57c5
        tableId.setPatientElecTroGramId(1);
        //string 40288aef6095cbe9016095cbe9e50000
        tableId.setPatientMotNerCondResuId(1);
        // string 40288aef6095cbe9016095cbe9e50006
        tableId.setPatientFWavStuResuId(1);
        // string 40288aef6095cbe9016095cbe9e50008
        tableId.setPatientSenNerCondResuId(1);
        //string 402890825e128585015e1315323a0008
        tableId.setPatientNeedExamResuId(1);
        //string 402890825e17eadd015e18e244fc000a
        tableId.setPatientMotUniAnaResuId(1);
        //string 402890825def1339015df402a9d90078
        tableId.setPatientIntPatAnaItemId(1);
        //
        tableId.setPatientFieldDetailId(tableIdService.getTableId(tableArray[35]));
        tableId.setPatientNerveSleepId(tableIdService.getTableId(tableArray[36]));
        tableId.setPatientInspectId(tableIdService.getTableId(tableArray[37]));
        tableId.setPatientBioexamId(tableIdService.getTableId(tableArray[38]));
        tableId.setPatientBioexamResultId(tableIdService.getTableId(tableArray[39]));
        tableId.setPatientGeneMutationInfoId(tableIdService.getTableId(tableArray[40]));
        tableId.setPatientBodypartId(tableIdService.getTableId(tableArray[41]));
        tableId.setPatientVitalSignId(tableIdService.getTableId(tableArray[42]));
        tableId.setPatientVitalSignDetailId(tableIdService.getTableId(tableArray[43]));
        tableId.setPatientPhytheReactionId(tableIdService.getTableId(tableArray[44]));
        tableId.setPatientPhytheTmsId(tableIdService.getTableId(tableArray[45]));
        tableId.setPatientPhytheAssessId(tableIdService.getTableId(tableArray[46]));
        tableId.setPatientAdverseId(tableIdService.getTableId(tableArray[47]));
        tableId.setPatientPreopsInfoId(tableIdService.getTableId(tableArray[48]));
        tableId.setPatientPreopsDiaryId(tableIdService.getTableId(tableArray[49]));
        tableId.setPatientPreopsScaleId(tableIdService.getTableId(tableArray[50]));
        tableId.setPatientPreopsMedicineId(tableIdService.getTableId(tableArray[51]));
        tableId.setPatientTreatmentId(tableIdService.getTableId(tableArray[52]));
        tableId.setPatientComplicationId(tableIdService.getTableId(tableArray[53]));
        tableId.setPatientDbsFirstId(tableIdService.getTableId(tableArray[54]));
        tableId.setPatientDbsFollowId(tableIdService.getTableId(tableArray[55]));
        tableId.setPatientDbsFirstDetailId(tableIdService.getTableId(tableArray[56]));
        tableId.setPatientDbsMedicineId(tableIdService.getTableId(tableArray[57]));
        tableId.setPatientDbsChooseId(tableIdService.getTableId(tableArray[58]));
        tableId.setPatientDbsParameterId(tableIdService.getTableId(tableArray[59]));
        //string 402816816109a2b7016109a563590002
        tableId.setPatientScaleFileId(tableIdService.getTableId(tableArray[60]));

        tableId.setPatientAdverseMedicineId(tableIdService.getTableId(tableArray[61]));
        tableId.setPatientAdverseSeriousId(tableIdService.getTableId(tableArray[62]));
        tableId.setPatientFirstVisitTreatmentId(tableIdService.getTableId(tableArray[63]));
        tableId.setPatientExerciseId(tableIdService.getTableId(tableArray[64]));
        tableId.setPatientMedicineAdverseId(tableIdService.getTableId(tableArray[65]));
        tableId.setPatientMedicineAdverseMdId(tableIdService.getTableId(tableArray[66]));
        tableId.setPatientSpephysicalId(tableIdService.getTableId(tableArray[67]));
        return tableId;
    }

    public String getStringIdNum(int num){
        String result = "00000";
        String numString = String.valueOf(num);
        return result.substring(0,5-numString.length()) + numString;
    }

    public void dealAloneData(List<PatientWholeInfo> patientWholeInfoList){
        for(int patientIdIndex = 0;patientIdIndex < patientWholeInfoList.size(); patientIdIndex ++) {
            patientWholeInfoList.get(patientIdIndex).setId(tableId.getPatientInfoId());

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDependentsList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().size();itemIndex ++){
                    dependentsDiff.put(patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().get(itemIndex).getId(),tableId.getPatientInfoId());
                    patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().get(itemIndex).setId(tableId.getPatientDependentsId());
                    patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientDependentsId(tableId.getPatientDependentsId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientAllergyList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientAllergyList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientAllergyList().get(itemIndex).setId(tableId.getPatientAllergyId());
                    patientWholeInfoList.get(patientIdIndex).getPatientAllergyList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientAllergyId(tableId.getPatientAllergyId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList().get(itemIndex).setId(tableId.getPatientCideexposedHistoryId());
                    patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientCideexposedHistoryId(tableId.getPatientCideexposedHistoryId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList().get(itemIndex).setId(tableId.getPatientDiseaseId());
                    patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientDiseaseId(tableId.getPatientDiseaseId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientHabitList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientHabitList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex).setId(tableId.getPatientHabitId());
                    patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    //哈尔冰医院特殊处理
                    //patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex).setPatientHabitId(patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex).getPatientHabitId() == 16 ? 19 : patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex).getPatientHabitId());
                    tableId.setPatientHabitId(tableId.getPatientHabitId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientHistoryList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientHistoryList().get(itemIndex).setId(tableId.getPatientHistoryId());
                    patientWholeInfoList.get(patientIdIndex).getPatientHistoryList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientHistoryId(tableId.getPatientHistoryId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList().get(itemIndex).setId(tableId.getPatientDiseaseOrderId());
                    patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientDiseaseOrderId(tableId.getPatientDiseaseOrderId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList().get(itemIndex).setId(tableId.getPatientFamilyHistoryId());
                    patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientFamilyHistoryId(tableId.getPatientFamilyHistoryId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList().get(itemIndex).setId(tableId.getPatientFirstSymbolId());
                    patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientFirstSymbolId(tableId.getPatientFirstSymbolId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList().get(itemIndex).setId(tableStringId.PATIENT_MED_HISTORY_ID + getStringIdNum(tableId.getPatientMedhistoryId()));
                    patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientMedhistoryId(tableId.getPatientMedhistoryId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList().get(itemIndex).setId(tableId.getPatientPaperoptionId());
                    patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientPaperoptionId(tableId.getPatientPaperoptionId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList().get(itemIndex).setId(tableId.getPatientFirstVisitTreatmentId());
                    patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientFirstVisitTreatmentId(tableId.getPatientFirstVisitTreatmentId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientExerciseList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientExerciseList().size();itemIndex ++){
                    patientWholeInfoList.get(patientIdIndex).getPatientExerciseList().get(itemIndex).setId(tableId.getPatientExerciseId());
                    patientWholeInfoList.get(patientIdIndex).getPatientExerciseList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    tableId.setPatientExerciseId(tableId.getPatientExerciseId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientCaseList())){
                dealPatientCase(patientWholeInfoList.get(patientIdIndex).getPatientCaseList());
            }
            tableId.setPatientInfoId(tableId.getPatientInfoId() + 1);
        }
    }

    public void dealPatientCase(List<PatientCase> patientCaseList){
        for(int patientCaseIndex = 0;patientCaseIndex < patientCaseList.size(); patientCaseIndex ++) {
            String patientCaseId = tableStringId.PATIENT_CASE_ID + getStringIdNum(tableId.getPatientCaseId());
            patientCaseList.get(patientCaseIndex).setId(patientCaseId);
            patientCaseList.get(patientCaseIndex).setPatientId(tableId.getPatientInfoId());
            // adverse
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).setId(tableId.getPatientAdverseId());
                    if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList())) {
                        for (int medicineIndex = 0 ; medicineIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList().size();medicineIndex++) {
                            patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList().get(medicineIndex).setAdverseId(tableId.getPatientAdverseId());
                            patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList().get(medicineIndex).setId(tableId.getPatientAdverseMedicineId());
                            tableId.setPatientAdverseMedicineId(tableId.getPatientAdverseMedicineId() + 1);
                        }
                    }
                    tableId.setPatientAdverseId(tableId.getPatientAdverseId() + 1);
                }
            }

            // adverseSerious
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().get(itemIndex).setId(tableId.getPatientAdverseSeriousId());
                    tableId.setPatientAdverseSeriousId(tableId.getPatientAdverseSeriousId() + 1);
                }
            }

            // bioexam
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientBioexamList())){
                dealPatientBioexam(patientCaseList.get(patientCaseIndex).getPatientBioexamList(), patientCaseId);
            }
            // bodypart
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientBodypartList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientBodypartList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientBodypartList().get(itemIndex).setPatient(tableId.getPatientInfoId());
                    patientCaseList.get(patientCaseIndex).getPatientBodypartList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientBodypartList().get(itemIndex).setId(tableId.getPatientBodypartId());
                    tableId.setPatientBodypartId(tableId.getPatientBodypartId() + 1);
                }
            }

            // PaperOption
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().get(itemIndex).setId(tableId.getPatientPaperoptionId());
                    tableId.setPatientPaperoptionId(tableId.getPatientPaperoptionId() + 1);
                }
            }

            // CombineMedicine
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientCombineMedicineList())){
                dealCombineMedicine(patientCaseList.get(patientCaseIndex).getPatientCombineMedicineList(),patientCaseId);
            }

            // ComplicationList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientComplicationList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientComplicationList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientComplicationList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientComplicationList().get(itemIndex).setId(tableId.getPatientComplicationId());
                    tableId.setPatientComplicationId(tableId.getPatientComplicationId() + 1);
                }
            }

            // DbsFirstList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDbsFirstList())){
                dealDbsFirst(patientCaseList.get(patientCaseIndex).getPatientDbsFirstList(),patientCaseId);
            }

            // DbsFollowList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDbsFollowList())){
                dealDbsFollow(patientCaseList.get(patientCaseIndex).getPatientDbsFollowList(),patientCaseId);
            }

            // PatientPhytheAssess
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPhytheAccessList())){
                dealPhyAccess(patientCaseList.get(patientCaseIndex).getPatientPhytheAccessList(),patientCaseId);
            }

            // PatientDependentAccompanying
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().get(itemIndex).setId(tableId.getPatientAccompanyingDiagnosisId());
                    patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().get(itemIndex).setPatientDependentsId(dependentsDiff.get(patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().get(itemIndex).getPatientDependentsId()));
                    tableId.setPatientAccompanyingDiagnosisId(tableId.getPatientAccompanyingDiagnosisId() + 1);
                }
            }

            // Patientdiary
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDiaryList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDiaryList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientDiaryList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientDiaryList().get(itemIndex).setId(tableId.getPatientDiaryId());
                    tableId.setPatientDiaryId(tableId.getPatientDiaryId() + 1);
                }
            }

            // PatientDiseaseComplication
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList().get(itemIndex).setId(tableId.getPatientDiseaseComplicationId());
                    tableId.setPatientDiseaseComplicationId(tableId.getPatientDiseaseComplicationId() + 1);
                }
            }
            // PatientElecTroGram
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientElecTroGramList())){
                dealElecTroGram(patientCaseList.get(patientCaseIndex).getPatientElecTroGramList(),patientCaseId);
            }

            // patientGait
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientGaitList())){
                dealGait(patientCaseList.get(patientCaseIndex).getPatientGaitList(),patientCaseId);
            }

            // patientMedicine
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientMedicineList())){
                dealMedicine(patientCaseList.get(patientCaseIndex).getPatientMedicineList(),patientCaseId);
            }

            // patientNerveSleep
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientNerveSleepList())){
                dealNerveSleep(patientCaseList.get(patientCaseIndex).getPatientNerveSleepList(),patientCaseId);
            }

            // patientPhytheTms
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPhytheTmsList())){
                dealPhytheTms(patientCaseList.get(patientCaseIndex).getPatientPhytheTmsList(),patientCaseId);
            }

            // patientPreopsInfo
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPreopsInfoList())){
                dealPreopsInfo(patientCaseList.get(patientCaseIndex).getPatientPreopsInfoList(),patientCaseId);
            }

            // patientScale
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientScaleList())){
                dealScale(patientCaseList.get(patientCaseIndex).getPatientScaleList(),patientCaseId);
            }

            // patientSymptom
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientSymptomList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientSymptomList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientSymptomList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientCaseList.get(patientCaseIndex).getPatientSymptomList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientSymptomList().get(itemIndex).setId(tableId.getPatientSymptomId());
                    tableId.setPatientSymptomId(tableId.getPatientSymptomId() + 1);
                }
            }

            // patientTreatment
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientTreatmentList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientTreatmentList().size(); itemIndex ++){
                    patientCaseList.get(patientCaseIndex).getPatientTreatmentList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientCaseList.get(patientCaseIndex).getPatientTreatmentList().get(itemIndex).setId(tableId.getPatientTreatmentId());
                    tableId.setPatientTreatmentId(tableId.getPatientTreatmentId() + 1);
                }
            }

            // patientVideoInfo
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientVideoInfoList())){
                dealVideoInfo(patientCaseList.get(patientCaseIndex).getPatientVideoInfoList(),patientCaseId);
            }

            // patientVitalSign
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientVitalSignList())){
                dealVitalSign(patientCaseList.get(patientCaseIndex).getPatientVitalSignList(),patientCaseId);
            }

            // PatientMedicineAdverse
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientMedicineAdverseList())){
                dealMedicineAdverse(patientCaseList.get(patientCaseIndex).getPatientMedicineAdverseList(),patientCaseId);
            }

            // PatientSpePhysical
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientSpephysicalList())){
                dealSpephysical(patientCaseList.get(patientCaseIndex).getPatientSpephysicalList(),patientCaseId);
            }

            tableId.setPatientCaseId(tableId.getPatientCaseId() + 1);
        }
    }

    public void dealPatientBioexam(List<PatientBioexam> patientBioexamList,String patientCaseId){
        for(int bioexamIndex = 0 ;bioexamIndex < patientBioexamList.size(); bioexamIndex ++){
            patientBioexamList.get(bioexamIndex).setPatientId(tableId.getPatientInfoId());
            patientBioexamList.get(bioexamIndex).setPatientCaseId(patientCaseId);
            patientBioexamList.get(bioexamIndex).setId(tableId.getPatientBioexamId());
            if(!CollectionUtils.isEmpty(patientBioexamList.get(bioexamIndex).getPatientBioexamResultList())){
                for(int bioexamResultIndex = 0 ;bioexamResultIndex<patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().size();bioexamResultIndex++){
                    patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex).setPatientId(tableId.getPatientInfoId());
                    patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex).setPatientCaseId(patientCaseId);
                    patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex).setPatientBioexamId(tableId.getPatientBioexamId());
                    patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex).setId(tableId.getPatientBioexamResultId());
                    tableId.setPatientBioexamResultId(tableId.getPatientBioexamResultId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList())){
                for(int geneMutationInIndex = 0 ;geneMutationInIndex<patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList().size();geneMutationInIndex++){
                    patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList().get(geneMutationInIndex).setBid(tableId.getPatientGeneMutationInfoId()+"");
                    patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList().get(geneMutationInIndex).setId(tableId.getPatientGeneMutationInfoId());
                    tableId.setPatientGeneMutationInfoId(tableId.getPatientGeneMutationInfoId() + 1);
                }
            }
            tableId.setPatientBioexamId(tableId.getPatientBioexamId() + 1);
        }
    }

    public void dealCombineMedicine(List<PatientCombineMedicine> patientCombineMedicineList, String patientCaseId){
        for(int combineIndex = 0 ;combineIndex < patientCombineMedicineList.size(); combineIndex ++){
            patientCombineMedicineList.get(combineIndex).setPatientId(tableId.getPatientInfoId());
            patientCombineMedicineList.get(combineIndex).setPatientCaseId(patientCaseId);
            patientCombineMedicineList.get(combineIndex).setId(tableId.getPatientCombineMedicineId());
            if(!CollectionUtils.isEmpty(patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList().size(); itemIndex ++){
                    patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList().get(itemIndex).setId(tableId.getPatientCombineMedicineDetailId());
                    patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList().get(itemIndex).setCombineMedicineId(tableId.getPatientCombineMedicineId());
                    tableId.setPatientCombineMedicineDetailId(tableId.getPatientCombineMedicineDetailId() + 1);
                }
            }
            tableId.setPatientCombineMedicineId(tableId.getPatientCombineMedicineId() + 1);
        }
    }


    public void dealDbsFirst(List<PatientDbsFirst> patientDbsFirstList, String patientCaseId){
        for(int dbsFirstIndex = 0 ;dbsFirstIndex < patientDbsFirstList.size(); dbsFirstIndex ++){
            patientDbsFirstList.get(dbsFirstIndex).setPatientCaseId(patientCaseId);
            patientDbsFirstList.get(dbsFirstIndex).setId(tableId.getPatientDbsFirstId());

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().size(); itemIndex ++){
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().get(itemIndex).setId(tableId.getPatientDbsFirstDetailId());
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().get(itemIndex).setTcPatientDbsFirstId(tableId.getPatientDbsFirstId());
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().get(itemIndex).setPatientDbsFirstId(tableId.getPatientDbsFirstId());
                    tableId.setPatientDbsFirstDetailId(tableId.getPatientDbsFirstDetailId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList().size(); itemIndex ++){
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList().get(itemIndex).setId(tableId.getPatientDbsMedicineId());
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList().get(itemIndex).setPatientDbsFirstId(tableId.getPatientDbsFirstId());
                    tableId.setPatientDbsMedicineId(tableId.getPatientDbsMedicineId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList().size(); itemIndex ++){
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList().get(itemIndex).setId(tableId.getPatientDbsParameterId());
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList().get(itemIndex).setPatientDbsFirstId(tableId.getPatientDbsFirstId());
                    tableId.setPatientDbsParameterId(tableId.getPatientDbsParameterId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList().size(); itemIndex ++){
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList().get(itemIndex).setId(tableId.getPatientDbsChooseId());
                    patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList().get(itemIndex).setPatientDbsFirstId(tableId.getPatientDbsFirstId());
                    tableId.setPatientDbsChooseId(tableId.getPatientDbsChooseId() + 1);
                }
            }
            tableId.setPatientDbsFirstId(tableId.getPatientDbsFirstId() + 1);
        }
    }

    public void dealDbsFollow(List<PatientDbsFollow> patientDbsFollowList, String patientCaseId){
        for(int dbsFollowIndex = 0 ;dbsFollowIndex < patientDbsFollowList.size(); dbsFollowIndex ++){
            patientDbsFollowList.get(dbsFollowIndex).setPatientCaseId(patientCaseId);
            patientDbsFollowList.get(dbsFollowIndex).setId(tableId.getPatientDbsFollowId());

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList().size(); itemIndex ++){
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList().get(itemIndex).setId(tableId.getPatientDbsMedicineId());
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList().get(itemIndex).setPatientDbsFollowId(tableId.getPatientDbsFollowId());
                    tableId.setPatientDbsMedicineId(tableId.getPatientDbsMedicineId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList().size(); itemIndex ++){
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList().get(itemIndex).setId(tableId.getPatientDbsParameterId());
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList().get(itemIndex).setPatientDbsFollowId(tableId.getPatientDbsFollowId());
                    tableId.setPatientDbsParameterId(tableId.getPatientDbsParameterId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList().size(); itemIndex ++){
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList().get(itemIndex).setId(tableId.getPatientDbsChooseId());
                    patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList().get(itemIndex).setPatientDbsFollowId(tableId.getPatientDbsFollowId());
                    tableId.setPatientDbsChooseId(tableId.getPatientDbsChooseId() + 1);
                }
            }
            tableId.setPatientDbsFollowId(tableId.getPatientDbsFollowId() + 1);
        }
    }

    public void  dealPhyAccess(List<PatientPhytheAssess> patientPhytheAssessList,String patientCaseId){
        for(int phyAccessIndex = 0 ;phyAccessIndex < patientPhytheAssessList.size(); phyAccessIndex ++){
            patientPhytheAssessList.get(phyAccessIndex).setPatientCaseId(patientCaseId);
            patientPhytheAssessList.get(phyAccessIndex).setId(tableId.getPatientPhytheAssessId());
            patientPhytheAssessList.get(phyAccessIndex).setPatientId(tableId.getPatientInfoId());
            if(!CollectionUtils.isEmpty(patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList())){
                for(int itemIndex = 0 ;itemIndex < patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList().size(); itemIndex ++){
                    logger.info(tableId.getPatientPhytheReactionId() + "");
                    patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList().get(itemIndex).setId(null);
                    patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList().get(itemIndex).setAssessId(tableId.getPatientPhytheAssessId());
                    tableId.setPatientPhytheReactionId(tableId.getPatientPhytheReactionId() + 1);
                }
            }

            tableId.setPatientPhytheAssessId(tableId.getPatientPhytheAssessId() + 1);
        }
    }

    public void  dealElecTroGram (List<PatientElecTroGram> patientElecTroGramList,String patientCaseId){
        for(int elecTroGramIndex = 0 ;elecTroGramIndex < patientElecTroGramList.size(); elecTroGramIndex ++){
            patientElecTroGramList.get(elecTroGramIndex).setPCaseId(patientCaseId);
            patientElecTroGramList.get(elecTroGramIndex).setPInfoId(tableId.getPatientInfoId());
            patientElecTroGramList.get(elecTroGramIndex).setId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().get(itemIndex).setId(tableStringId.PATIENT_MOT_NER_COND_RESU_ID + getStringIdNum(tableId.getPatientMotNerCondResuId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientMotNerCondResuId(tableId.getPatientMotNerCondResuId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().get(itemIndex).setId(tableStringId.PATIENT_F_WAV_STU_RESU_ID + getStringIdNum(tableId.getPatientFWavStuResuId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientFWavStuResuId(tableId.getPatientFWavStuResuId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().get(itemIndex).setId(tableStringId.PATIENT_SEN_NER_COND_RESU_ID + getStringIdNum(tableId.getPatientSenNerCondResuId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientSenNerCondResuId(tableId.getPatientSenNerCondResuId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().get(itemIndex).setId(tableStringId.PATIENT_NEED_EXAM_RESU_ID + getStringIdNum(tableId.getPatientNeedExamResuId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientNeedExamResuId(tableId.getPatientNeedExamResuId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().get(itemIndex).setId(tableStringId.PATIENT_MOT_UNI_ANA_RESU_ID + getStringIdNum(tableId.getPatientMotUniAnaResuId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientMotUniAnaResuId(tableId.getPatientMotUniAnaResuId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().size(); itemIndex ++){
                    patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().get(itemIndex).setId(tableStringId.PATIENT_INT_PAT_ANA_ITEM_ID + getStringIdNum(tableId.getPatientIntPatAnaItemId()));
                    patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().get(itemIndex).setPCaseId(patientCaseId);
                    patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().get(itemIndex).setPInfoId(tableId.getPatientInfoId());
                    patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().get(itemIndex).setPElecTroGramId(tableStringId.PATIENT_ELEC_TRO_GRAM_ID + getStringIdNum(tableId.getPatientElecTroGramId()));
                    tableId.setPatientIntPatAnaItemId(tableId.getPatientIntPatAnaItemId() + 1);
                }
            }

            tableId.setPatientElecTroGramId(tableId.getPatientElecTroGramId() + 1);
        }
    }

    public void dealGait(List<PatientGait> patientGaitList,String patientCaseId){
        for(int gaitIndex = 0 ;gaitIndex<patientGaitList.size();gaitIndex++){
            patientGaitList.get(gaitIndex).setPatientCaseId(patientCaseId);
            patientGaitList.get(gaitIndex).setPatientId(tableId.getPatientInfoId());
            patientGaitList.get(gaitIndex).setId(tableStringId.PATIENT_GAIT_ID + getStringIdNum(tableId.getPatientGaitId()));

            if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientGaitItemList())){
                for (int itemIndex = 0 ;itemIndex<patientGaitList.get(gaitIndex).getPatientGaitItemList().size();itemIndex++){
                    patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).setGaitId(tableStringId.PATIENT_GAIT_ID + getStringIdNum(tableId.getPatientGaitId()));
                    patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).setId(tableStringId.PATIENT_GAIT_ITEM_ID + getStringIdNum(tableId.getPatientGaitItemId()));
                    if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList())){
                        for (int checkIndex = 0 ;checkIndex<patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList().size();checkIndex++){
                            patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList().get(checkIndex).setGaitItemId(tableStringId.PATIENT_GAIT_ITEM_ID + getStringIdNum(tableId.getPatientGaitItemId()));
                            patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList().get(checkIndex).setId(tableStringId.PATIENT_GAIT_CHECK_ID + getStringIdNum(tableId.getPatientGaitCheckId()));
                            tableId.setPatientGaitCheckId(tableId.getPatientGaitCheckId() + 1);
                        }
                    }
                    tableId.setPatientGaitItemId(tableId.getPatientGaitItemId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientInspectList())){
                for (int itemIndex = 0 ;itemIndex<patientGaitList.get(gaitIndex).getPatientInspectList().size();itemIndex++){
                    patientGaitList.get(gaitIndex).getPatientInspectList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientGaitList.get(gaitIndex).getPatientInspectList().get(itemIndex).setId(tableId.getPatientInspectId());
                    tableId.setPatientInspectId(tableId.getPatientInspectId() + 1);
                }
            }

            tableId.setPatientGaitId(tableId.getPatientGaitId() + 1);
        }
    }

    public void dealMedicine(List<PatientMedicine> patientMedicineList,String patientCaseId){
        for(int combineIndex = 0 ;combineIndex < patientMedicineList.size(); combineIndex ++){
            patientMedicineList.get(combineIndex).setPatientId(tableId.getPatientInfoId());
            patientMedicineList.get(combineIndex).setPatientCaseId(patientCaseId);
            patientMedicineList.get(combineIndex).setId(tableId.getPatientMedicineId());
            if(!CollectionUtils.isEmpty(patientMedicineList.get(combineIndex).getPatientMedicineDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientMedicineList.get(combineIndex).getPatientMedicineDetailList().size(); itemIndex ++){
                    patientMedicineList.get(combineIndex).getPatientMedicineDetailList().get(itemIndex).setId(tableId.getPatientMedicineDetailId());
                    patientMedicineList.get(combineIndex).getPatientMedicineDetailList().get(itemIndex).setPatientMedicineId(tableId.getPatientMedicineId());
                    tableId.setPatientMedicineDetailId(tableId.getPatientMedicineDetailId() + 1);
                }
            }
            tableId.setPatientMedicineId(tableId.getPatientMedicineId() + 1);
        }
    }

    public void dealNerveSleep (List<PatientNerveSleep> patientNerveSleepList,String patientCaseId) {
        for(int sleepIndex = 0 ; sleepIndex<patientNerveSleepList.size();sleepIndex++){
            patientNerveSleepList.get(sleepIndex).setPatientCaseId(patientCaseId);
            patientNerveSleepList.get(sleepIndex).setPatientId(tableId.getPatientInfoId());
            patientNerveSleepList.get(sleepIndex).setId(tableId.getPatientNerveSleepId());
            if(!CollectionUtils.isEmpty(patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList().get(itemIndex).setBusinessId(tableId.getPatientNerveSleepId());
                    patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList().get(itemIndex).setId(tableId.getPatientFieldDetailId());
                    tableId.setPatientFieldDetailId(tableId.getPatientFieldDetailId() + 1);
                }
            }
            tableId.setPatientNerveSleepId(tableId.getPatientNerveSleepId() + 1);
        }
    }

    public void dealPhytheTms (List<PatientPhytheTms> patientPhytheTmsList,String patientCaseId) {
        for(int tmsIndex = 0 ; tmsIndex< patientPhytheTmsList.size(); tmsIndex ++){
            patientPhytheTmsList.get(tmsIndex).setPatientCaseId(patientCaseId);
            patientPhytheTmsList.get(tmsIndex).setPatientId(tableId.getPatientInfoId());
            patientPhytheTmsList.get(tmsIndex).setId(tableId.getPatientPhytheTmsId());

            if(!CollectionUtils.isEmpty(patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList())){
                for(int itemIndex = 0 ;itemIndex < patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList().size(); itemIndex ++){
                    logger.info(tableId.getPatientPhytheReactionId() + "");
                    patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList().get(itemIndex).setId(null);
                    patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList().get(itemIndex).setAssessId(tableId.getPatientPhytheTmsId());
                    tableId.setPatientPhytheReactionId(tableId.getPatientPhytheReactionId() + 1);
                }
            }
            tableId.setPatientPhytheTmsId(tableId.getPatientPhytheTmsId() + 1);
        }
    }

    public void dealPreopsInfo(List<PatientPreopsInfo> patientPreopsInfoList,String patientCaseId){
        for(int preIndex = 0 ; preIndex< patientPreopsInfoList.size(); preIndex ++){
            patientPreopsInfoList.get(preIndex).setPatientCaseId(patientCaseId);
            patientPreopsInfoList.get(preIndex).setId(tableId.getPatientPreopsInfoId());

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList().size(); itemIndex ++){
                    patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList().get(itemIndex).setPatientPreopsInfoId(tableId.getPatientPreopsInfoId());
                    patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList().get(itemIndex).setId(tableId.getPatientPreopsDiaryId());
                    tableId.setPatientPreopsDiaryId(tableId.getPatientPreopsDiaryId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList().size(); itemIndex ++){
                    patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList().get(itemIndex).setPatientPreopsInfoId(tableId.getPatientPreopsInfoId());
                    patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList().get(itemIndex).setId(tableId.getPatientPreopsScaleId());
                    tableId.setPatientPreopsScaleId(tableId.getPatientPreopsScaleId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList().size(); itemIndex ++){
                    patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList().get(itemIndex).setPatientPreopsInfoId(tableId.getPatientPreopsInfoId());
                    patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList().get(itemIndex).setId(tableId.getPatientPreopsMedicineId());
                    tableId.setPatientPreopsMedicineId(tableId.getPatientPreopsMedicineId() + 1);
                }
            }

            tableId.setPatientPreopsInfoId(tableId.getPatientPreopsInfoId() + 1);
        }
    }

    public void dealScale (List<PatientScale> patientScaleList,String patientCaseId){
        for(int scaleIndex = 0 ; scaleIndex < patientScaleList.size(); scaleIndex ++){
            patientScaleList.get(scaleIndex).setPatientId(tableId.getPatientInfoId());
            patientScaleList.get(scaleIndex).setPatientCaseId(patientCaseId);
            patientScaleList.get(scaleIndex).setId(tableId.getPatientScaleId());

            if(!CollectionUtils.isEmpty(patientScaleList.get(scaleIndex).getPatientOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientScaleList.get(scaleIndex).getPatientOptionList().size(); itemIndex ++){
                    patientScaleList.get(scaleIndex).getPatientOptionList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientScaleList.get(scaleIndex).getPatientOptionList().get(itemIndex).setPatientScaleId(tableId.getPatientScaleId());
                    patientScaleList.get(scaleIndex).getPatientOptionList().get(itemIndex).setId(tableId.getPatientOptionId());
                    tableId.setPatientOptionId(tableId.getPatientOptionId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientScaleList.get(scaleIndex).getPatientScaleFileList())){
                for(int itemIndex = 0 ;itemIndex < patientScaleList.get(scaleIndex).getPatientScaleFileList().size(); itemIndex ++){
                    patientScaleList.get(scaleIndex).getPatientScaleFileList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientScaleList.get(scaleIndex).getPatientScaleFileList().get(itemIndex).setPatientCaseId(patientCaseId);
                    patientScaleList.get(scaleIndex).getPatientScaleFileList().get(itemIndex).setPatientScaleId(tableId.getPatientScaleId());
                    patientScaleList.get(scaleIndex).getPatientScaleFileList().get(itemIndex).setId(tableStringId.PATIENT_SCALE_FILE_ID + getStringIdNum(tableId.getPatientScaleFileId()));
                    tableId.setPatientScaleFileId(tableId.getPatientScaleFileId() + 1);
                }
            }
            tableId.setPatientScaleId(tableId.getPatientScaleId() + 1);
        }
    }

    public void dealVideoInfo (List<PatientVideoInfo> patientVideoInfoList, String patientCaseId) {
        for(int videoIndex = 0 ; videoIndex < patientVideoInfoList.size(); videoIndex ++){
            patientVideoInfoList.get(videoIndex).setId(tableId.getPatientInfoId());
            patientVideoInfoList.get(videoIndex).setPatientCaseId(patientCaseId);
            patientVideoInfoList.get(videoIndex).setId(tableId.getPatientVideoInfoId());

            if(!CollectionUtils.isEmpty(patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList())){
                for(int itemIndex = 0 ;itemIndex < patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList().size(); itemIndex ++){
                    patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList().get(itemIndex).setPatientId(tableId.getPatientInfoId());
                    patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList().get(itemIndex).setId(tableStringId.PATIENT_VIDEO_ATTACHMENT_ID + getStringIdNum(tableId.getPatientAttachmentId()));

                    tableId.setPatientAttachmentId(tableId.getPatientAttachmentId() + 1);
                }
            }

            if(!CollectionUtils.isEmpty(patientVideoInfoList.get(videoIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientVideoInfoList.get(videoIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientVideoInfoList.get(videoIndex).getPatientFieldDetailList().get(itemIndex).setBusinessId(tableId.getPatientNerveSleepId());
                    patientVideoInfoList.get(videoIndex).getPatientFieldDetailList().get(itemIndex).setId(tableId.getPatientFieldDetailId());
                    tableId.setPatientFieldDetailId(tableId.getPatientFieldDetailId() + 1);
                }
            }

            tableId.setPatientVideoInfoId(tableId.getPatientVideoInfoId() + 1);
        }
    }

    public void dealVitalSign (List<PatientVitalSign> patientVitalSignList,String patientCaseId) {
        for(int vitalIndex = 0 ;vitalIndex < patientVitalSignList.size(); vitalIndex ++){
            patientVitalSignList.get(vitalIndex).setPatientCaseId(patientCaseId);
            patientVitalSignList.get(vitalIndex).setId(tableId.getPatientVitalSignId());
            if(!CollectionUtils.isEmpty(patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().size(); itemIndex ++){
                    patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().get(itemIndex).setId(tableId.getPatientVitalSignDetailId());
                    patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().get(itemIndex).setPatientVitalsignId(tableId.getPatientVitalSignId());
                    patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().get(itemIndex).setPatientCaseId(patientCaseId);
                    tableId.setPatientVitalSignDetailId(tableId.getPatientVitalSignDetailId() + 1);
                }
            }
            tableId.setPatientVitalSignId(tableId.getPatientVitalSignId() + 1);
        }
    }

    public void dealMedicineAdverse(List<PatientMedicineAdverse> patientMedicineAdverseList,String patientCaseId){
        for(int adverseIndex = 0 ;adverseIndex < patientMedicineAdverseList.size(); adverseIndex ++){
            patientMedicineAdverseList.get(adverseIndex).setPatientCaseId(patientCaseId);
            patientMedicineAdverseList.get(adverseIndex).setId(tableId.getPatientMedicineAdverseId());
            if(!CollectionUtils.isEmpty(patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList())){
                for(int itemIndex = 0 ;itemIndex < patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList().size(); itemIndex ++){
                    patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList().get(itemIndex).setId(tableId.getPatientMedicineAdverseMdId());
                    patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList().get(itemIndex).setMedicineAdverseId(tableId.getPatientMedicineAdverseId());
                    tableId.setPatientMedicineAdverseMdId(tableId.getPatientMedicineAdverseMdId() + 1);
                }
            }
            tableId.setPatientMedicineAdverseId(tableId.getPatientMedicineAdverseId() + 1);
        }
    }

    public void dealSpephysical(List<PatientSpephysical> patientSpephysicalList,String patientCaseId){
        for(int spephysicalIndex = 0 ;spephysicalIndex < patientSpephysicalList.size(); spephysicalIndex ++){
            patientSpephysicalList.get(spephysicalIndex).setPatientCaseId(patientCaseId);
            patientSpephysicalList.get(spephysicalIndex).setId(tableId.getPatientSpephysicalId());

            if(!CollectionUtils.isEmpty(patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList().get(itemIndex).setId(tableId.getPatientFieldDetailId());
                    patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList().get(itemIndex).setBusinessId(tableId.getPatientSpephysicalId());
                    tableId.setPatientFieldDetailId(tableId.getPatientFieldDetailId() + 1);
                }
            }
            tableId.setPatientSpephysicalId(tableId.getPatientSpephysicalId() + 1);
        }
    }
}
