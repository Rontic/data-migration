package com.gyenno.ruiyun.datamigration.service.patient.impl;

import com.gyenno.ruiyun.datamigration.annotation.DataBase;
import com.gyenno.ruiyun.datamigration.mapper.patient.*;
import com.gyenno.ruiyun.datamigration.model.patient.*;
import com.gyenno.ruiyun.datamigration.service.patient.AddDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import java.util.List;

@Service
public class AddDataServiceImpl implements AddDataService {

    private final static Logger logger = (Logger) LoggerFactory.getLogger("数据正在迁移中:");

    @Autowired
    private PatientVitalSignMapper patientVitalSignMapper;

    @Autowired
    private PatientVitalSignDetailMapper patientVitalSignDetailMapper;

    @Autowired
    private PatientVideoInfoMapper patientVideoInfoMapper;

    @Autowired
    private PatientInfoMapper patientInfoMapper;

    @Autowired
    private PatientDependentsMapper patientDependentsMapper;

    @Autowired
    private PatientDependentsMapper patientAllergyListMapper;

    @Autowired
    private PatientCideexposedHistoryMapper patientCideexposedHistoryMapper;

    @Autowired
    private PatientExerciseMapper patientExerciseMapper;

    @Autowired
    private PatientFirstVisitTreatmentMapper patientFirstVisitTreatmentMapper;
    @Autowired
    private PatientHistoryMapper patientHistoryMapper;
    @Autowired
    private PatientGaitCheckMapper patientGaitCheckMapper;
    @Autowired
    private PatientPhytheAssessMapper patientPhytheAssessMapper;
    @Autowired
    private PatientAllergyMapper patientAllergyMapper;
    @Autowired
    private PatientWholeInfoMapper patientWholeInfoMapper;
    @Autowired
    private PatientDiseaseMapper patientDiseaseMapper;
    @Autowired
    private PatientMotUniAnaResuMapper patientMotUniAnaResuMapper;
    @Autowired
    private PatientDbsFirstMapper patientDbsFirstMapper;
    @Autowired
    private PatientDbsMedicineMapper patientDbsMedicineMapper;
    @Autowired
    private PatientPreopsInfoMapper patientPreopsInfoMapper;
    @Autowired
    private PatientBioexamResultMapper patientBioexamResultMapper;
    @Autowired
    private PatientPhytheReactionMapper patientPhytheReactionMapper;
    @Autowired
    private PatientPreopsDiaryMapper patientPreopsDiaryMapper;
    @Autowired
    private PatientGenphysicalMapper patientGenphysicalMapper;
    @Autowired
    private PatientPaperOptionMapper patientPaperOptionMapper;
    @Autowired
    private PatientDbsFollowMapper patientDbsFollowMapper;
    @Autowired
    private PatientSideeffectMapper patientSideeffectMapper;

    @Autowired
    private PatientDependentAccompanyingMapper patientDependentAccompanyingMapper;

    @Autowired
    private PatientCombineMedicineMapper patientCombineMedicineMapper;
    @Autowired
    private PatientAccidentMapper patientAccidentMapper;
    @Autowired
    private PatientDbsParameterMapper patientDbsParameterMapper;
    @Autowired
    private PatientDbsFirstDetailMapper patientDbsFirstDetailMapper;
    @Autowired
    private PatientSenNerCondResuMapper patientSenNerCondResuMapper;
    @Autowired
    private PatientOptionMapper patientOptionMapper;

    @Autowired
    private PatientElecTroGramMapper patientElecTroGramMapper;
    @Autowired
    private PatientNerveSleepMapper patientNerveSleepMapper;
    @Autowired
    private PatientFamilyHistoryMapper patientFamilyHistoryMapper;
    @Autowired
    private PatientAdverseMapper patientAdverseMapper;
    @Autowired
    private PatientHabitMapper patientHabitMapper;
    @Autowired
    private PatientIntPatAnaItemMapper patientIntPatAnaItemMapper;
    @Autowired
    private PatientMedicineAdverseMapper patientMedicineAdverseMapper;
    @Autowired
    private PatientSpephysicalMapper patientSpephysicalMapper;
    @Autowired
    private PatientAdverseMedicineMapper patientAdverseMedicineMapper;
    @Autowired
    private PatientNeedExamMapper patientNeedExamMapper;
    @Autowired
    private PatientPreopsMedicineMapper patientPreopsMedicineMapper;
    @Autowired
    private PatientMedicineMapper patientMedicineMapper;
    @Autowired
    private PatientTreatmentMapper patientTreatmentMapper;
    @Autowired
    private PatientDiseaseOrderMapper patientDiseaseOrderMapper;
    @Autowired
    private PatientInspectMapper patientInspectMapper;
    @Autowired
    private PatientGaitItemMapper patientGaitItemMapper;
    @Autowired
    private PatientGeneMutationInfoMapper patientGeneMutationInfoMapper;
    @Autowired
    private PatientDiseaseComplicationMapper patientDiseaseComplicationMapper;
    @Autowired
    private PatientExtraMapper patientExtraMapper;
    @Autowired
    private PatientDiaryMapper patientDiaryMapper;
    @Autowired
    private PatientSurgicalMapper patientSurgicalMapper;
    @Autowired
    private PatientBodypartMapper patientBodypartMapper;
    @Autowired
    private PatientFWavStuMapper patientFWavStuMapper;
    @Autowired
    private PatientSenNerCondInfoMapper patientSenNerCondInfoMapper;
    @Autowired
    private PatientCombineMedicineDetailMapper patientCombineMedicineDetailMapper;
    @Autowired
    private PatientNeedExamResuMapper patientNeedExamResuMapper;
    @Autowired
    private PatientDbsChooseMapper patientDbsChooseMapper;
    @Autowired
    private PatientSymptomMapper patientSymptomMapper;
    @Autowired
    private PatientComplicationMapper patientComplicationMapper;
    @Autowired
    private PatientFWavStuResuMapper patientFWavStuResuMapper;
    @Autowired
    private PatElecTroGramMapper patElecTroGramMapper;
    @Autowired
    private PatientFirstSymbolMapper patientFirstSymbolMapper;
    @Autowired
    private PatientPhytheTmsMapper patientPhytheTmsMapper;
    @Autowired
    private PatientMotUniAnaMapper patientMotUniAnaMapper;
    @Autowired
    private PatientMotNerCondInfoMapper patientMotNerCondInfoMapper;
    @Autowired
    private PatientScaleFileMapper patientScaleFileMapper;
    @Autowired
    private PatientAttachmentMapper patientAttachmentMapper;
    @Autowired
    private PatientGaitMapper patientGaitMapper;
    @Autowired
    private PatientPreopsScaleMapper patientPreopsScaleMapper;
    @Autowired
    private PatientMedhistoryMapper patientMedhistoryMapper;
    @Autowired
    private PatientFieldDetailMapper patientFieldDetailMapper;
    @Autowired
    private PatientScaleMapper patientScaleMapper;
    @Autowired
    private PatientIntPatAnaMapper patientIntPatAnaMapper;
    @Autowired
    private PatientCaseMapper patientCaseMapper;
    @Autowired
    private PatientAdverseSeriousMapper patientAdverseSeriousMapper;
    @Autowired
    private PatientGroupeMapper patientGroupeMapper;
    @Autowired
    private PatientMotNerCondResuMapper patientMotNerCondResuMapper;
    @Autowired
    private PatientMedicineDetailMapper patientMedicineDetailMapper;
    @Autowired
    private PatientBioexamMapper patientBioexamMapper;
    @Autowired
    private PatientMedicineAdverseMdMapper patientMedicineAdverseMdMapper;

    @Override
    @DataBase("dbcloud")
    @Transactional(propagation = Propagation.REQUIRED,value = "transactionManager",rollbackFor = Exception.class)
    public void insetWholeData(List<PatientWholeInfo> patientWholeInfoList)  {
        for(int patientIdIndex = 0;patientIdIndex < patientWholeInfoList.size(); patientIdIndex ++) {
            patientInfoMapper.insertSelective(patientWholeInfoList.get(patientIdIndex));
            logger.info("正在添加第"+(patientIdIndex+1)+ "个患者【"+patientWholeInfoList.get(patientIdIndex).getPtname()+"】的数据");
            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDependentsList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().size();itemIndex ++){
                    patientDependentsMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientDependentsList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientAllergyList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientAllergyList().size();itemIndex ++){
                    patientAllergyMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientAllergyList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList().size();itemIndex ++){
                    patientCideexposedHistoryMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientCideexposedHistoryList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList().size();itemIndex ++){
                    patientDiseaseMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientHabitList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientHabitList().size();itemIndex ++){
                   patientHabitMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientHabitList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientHistoryList().size();itemIndex ++){
                    patientHistoryMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientHistoryList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList().size();itemIndex ++){
                    patientDiseaseOrderMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientDiseaseOrderList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList().size();itemIndex ++){
                    patientFamilyHistoryMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientFamilyHistoryList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList().size();itemIndex ++){
                   patientFirstSymbolMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientFirstSymbolList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList().size();itemIndex ++){
                    patientMedhistoryMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientMedHistoryList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList().size();itemIndex ++){
                    patientPaperOptionMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientPaperOptionList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientExerciseList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientExerciseList().size();itemIndex ++){
                    patientExerciseMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientExerciseList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList())){
                for(int itemIndex = 0 ;itemIndex < patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList().size();itemIndex ++){
                    patientFirstVisitTreatmentMapper.insertSelective(patientWholeInfoList.get(patientIdIndex).getPatientFirstVisitTreatmentList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientWholeInfoList.get(patientIdIndex).getPatientCaseList())){
                dealPatientCase(patientWholeInfoList.get(patientIdIndex).getPatientCaseList());
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealPatientCase(List<PatientCase> patientCaseList){
        for(int patientCaseIndex = 0;patientCaseIndex < patientCaseList.size(); patientCaseIndex ++) {

            patientCaseMapper.insertSelective(patientCaseList.get(patientCaseIndex));

            // adverse
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseList().size(); itemIndex ++){
                    patientAdverseMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex));
                    if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList())) {
                        for (int medicineIndex = 0 ; medicineIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList().size();medicineIndex++) {
                            patientAdverseMedicineMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientAdverseList().get(itemIndex).getPatientAdverseMedicineList().get(medicineIndex));
                        }
                    }
                }
            }

            // adverseSerious
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().size(); itemIndex ++){
                    patientAdverseSeriousMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientAdverseSeriousList().get(itemIndex));
                }
            }

            // bioexam
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientBioexamList())){
                dealPatientBioexam(patientCaseList.get(patientCaseIndex).getPatientBioexamList());
            }
            // bodypart
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientBodypartList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientBodypartList().size(); itemIndex ++){
                    patientBodypartMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientBodypartList().get(itemIndex));
                }
            }

            // PaperOption
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().size(); itemIndex ++){
                   patientPaperOptionMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientCasePaperOptionList().get(itemIndex));
                }
            }

            // CombineMedicine
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientCombineMedicineList())){
                dealCombineMedicine(patientCaseList.get(patientCaseIndex).getPatientCombineMedicineList());
            }

            // ComplicationList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientComplicationList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientComplicationList().size(); itemIndex ++){
                    patientComplicationMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientComplicationList().get(itemIndex));
                }
            }

            // DbsFirstList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDbsFirstList())){
                dealDbsFirst(patientCaseList.get(patientCaseIndex).getPatientDbsFirstList());
            }

            // DbsFollowList
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDbsFollowList())){
                dealDbsFollow(patientCaseList.get(patientCaseIndex).getPatientDbsFollowList());
            }

            // PatientPhytheAssess
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPhytheAccessList())){
                dealPhyAccess(patientCaseList.get(patientCaseIndex).getPatientPhytheAccessList());
            }

            // PatientDependentAccompanying
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().size(); itemIndex ++){
                    patientDependentAccompanyingMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientDependentAccompanyingList().get(itemIndex));
                }
            }

            // Patientdiary
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDiaryList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDiaryList().size(); itemIndex ++){
                    patientDiaryMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientDiaryList().get(itemIndex));
                }
            }

            // PatientDiseaseComplication
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList().size(); itemIndex ++){
                    patientDiseaseComplicationMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientDiseaseComplicationList().get(itemIndex));
                }
            }
            // PatientElecTroGram
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientElecTroGramList())){
                dealElecTroGram(patientCaseList.get(patientCaseIndex).getPatientElecTroGramList());
            }

            // patientGait
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientGaitList())){
                dealGait(patientCaseList.get(patientCaseIndex).getPatientGaitList());
            }

            // patientMedicine
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientMedicineList())){
                dealMedicine(patientCaseList.get(patientCaseIndex).getPatientMedicineList());
            }

            // patientNerveSleep
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientNerveSleepList())){
                dealNerveSleep(patientCaseList.get(patientCaseIndex).getPatientNerveSleepList());
            }

            // patientPhytheTms
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPhytheTmsList())){
                dealPhytheTms(patientCaseList.get(patientCaseIndex).getPatientPhytheTmsList());
            }

            // patientPreopsInfo
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientPreopsInfoList())){
                dealPreopsInfo(patientCaseList.get(patientCaseIndex).getPatientPreopsInfoList());
            }

            // patientScale
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientScaleList())){
                dealScale(patientCaseList.get(patientCaseIndex).getPatientScaleList());
            }

            // patientSymptom
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientSymptomList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientSymptomList().size(); itemIndex ++){
                    patientSymptomMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientSymptomList().get(itemIndex));
                }
            }

            // patientTreatment
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientTreatmentList())){
                for(int itemIndex = 0 ;itemIndex < patientCaseList.get(patientCaseIndex).getPatientTreatmentList().size(); itemIndex ++){
                    patientTreatmentMapper.insertSelective(patientCaseList.get(patientCaseIndex).getPatientTreatmentList().get(itemIndex));
                }
            }

            // patientVideoInfo
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientVideoInfoList())){
                dealVideoInfo(patientCaseList.get(patientCaseIndex).getPatientVideoInfoList());
            }

            // patientVitalSign
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientVitalSignList())){
                dealVitalSign(patientCaseList.get(patientCaseIndex).getPatientVitalSignList());
            }

            // patientVitalSign
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientMedicineAdverseList())){
                dealMedicineAdverse(patientCaseList.get(patientCaseIndex).getPatientMedicineAdverseList());
            }

            // patientSpephysical
            if(!CollectionUtils.isEmpty(patientCaseList.get(patientCaseIndex).getPatientSpephysicalList())){
                dealSpephysical(patientCaseList.get(patientCaseIndex).getPatientSpephysicalList());
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealPatientBioexam(List<PatientBioexam> patientBioexamList){
        for(int bioexamIndex = 0 ;bioexamIndex < patientBioexamList.size(); bioexamIndex ++){
            patientBioexamMapper.insertSelective(patientBioexamList.get(bioexamIndex));

            if(!CollectionUtils.isEmpty(patientBioexamList.get(bioexamIndex).getPatientBioexamResultList())){
                for(int bioexamResultIndex = 0 ;bioexamResultIndex<patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().size();bioexamResultIndex++){
                    //logger.info(patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex).getBioexamProjectId().toString());
                    patientBioexamResultMapper.insertSelective(patientBioexamList.get(bioexamIndex).getPatientBioexamResultList().get(bioexamResultIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList())){
                for(int geneMutationInIndex = 0 ;geneMutationInIndex<patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList().size();geneMutationInIndex++){
                    patientGeneMutationInfoMapper.insertSelective(patientBioexamList.get(bioexamIndex).getPatientGeneMutationInfoList().get(geneMutationInIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealCombineMedicine(List<PatientCombineMedicine> patientCombineMedicineList){
        for(int combineIndex = 0 ;combineIndex < patientCombineMedicineList.size(); combineIndex ++){

            patientCombineMedicineMapper.insertSelective(patientCombineMedicineList.get(combineIndex));

            if(!CollectionUtils.isEmpty(patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList().size(); itemIndex ++){
                    patientCombineMedicineDetailMapper.insertSelective(patientCombineMedicineList.get(combineIndex).getPatientCombineMedicineDetailList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealDbsFirst(List<PatientDbsFirst> patientDbsFirstList){
        for(int dbsFirstIndex = 0 ;dbsFirstIndex < patientDbsFirstList.size(); dbsFirstIndex ++){
            patientDbsFirstMapper.insertSelective(patientDbsFirstList.get(dbsFirstIndex));

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().size(); itemIndex ++){
                    patientDbsFirstDetailMapper.insertSelective(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsFirstDetailList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList().size(); itemIndex ++){
                    patientDbsMedicineMapper.insertSelective(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsMedicineList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList().size(); itemIndex ++){
                    patientDbsParameterMapper.insertSelective(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsParameterList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList().size(); itemIndex ++){
                    patientDbsChooseMapper.insertSelective(patientDbsFirstList.get(dbsFirstIndex).getPatientDbsChooseList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealDbsFollow(List<PatientDbsFollow> patientDbsFollowList){
        for(int dbsFollowIndex = 0 ;dbsFollowIndex < patientDbsFollowList.size(); dbsFollowIndex ++){
            patientDbsFollowMapper.insertSelective(patientDbsFollowList.get(dbsFollowIndex));

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList().size(); itemIndex ++){
                    patientDbsMedicineMapper.insertSelective(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsMedicineList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList().size(); itemIndex ++){
                   patientDbsParameterMapper.insertSelective( patientDbsFollowList.get(dbsFollowIndex).getPatientDbsParameterList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList())){
                for(int itemIndex = 0 ;itemIndex < patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList().size(); itemIndex ++){
                    patientDbsChooseMapper.insertSelective(patientDbsFollowList.get(dbsFollowIndex).getPatientDbsChooseList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void  dealPhyAccess(List<PatientPhytheAssess> patientPhytheAssessList){
        for(int phyAccessIndex = 0 ;phyAccessIndex < patientPhytheAssessList.size(); phyAccessIndex ++){
            patientPhytheAssessMapper.insertSelective(patientPhytheAssessList.get(phyAccessIndex));
            if(!CollectionUtils.isEmpty(patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList())){
                for(int itemIndex = 0 ;itemIndex < patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList().size(); itemIndex ++){
                    patientPhytheReactionMapper.insertSelective(patientPhytheAssessList.get(phyAccessIndex).getPatientPhytheReactionList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void  dealElecTroGram (List<PatientElecTroGram> patientElecTroGramList){
        for(int elecTroGramIndex = 0 ;elecTroGramIndex < patientElecTroGramList.size(); elecTroGramIndex ++){
            patientElecTroGramMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex));

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().size(); itemIndex ++){
                    patientMotNerCondResuMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientMotNerCondResuList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().size(); itemIndex ++){
                    patientFWavStuResuMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientFWavStuResuList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().size(); itemIndex ++){
                    patientSenNerCondResuMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientSenNerCondResuList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().size(); itemIndex ++){
                    patientNeedExamResuMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientNeedExamResuList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().size(); itemIndex ++){
                    patientMotUniAnaResuMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientMotUniAnaResuList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList())){
                for(int itemIndex = 0 ;itemIndex < patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().size(); itemIndex ++){
                    patientIntPatAnaItemMapper.insertSelective(patientElecTroGramList.get(elecTroGramIndex).getPatientIntPatAnaItemList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealGait(List<PatientGait> patientGaitList){
        for(int gaitIndex = 0 ;gaitIndex<patientGaitList.size();gaitIndex++){
            patientGaitMapper.insertSelective(patientGaitList.get(gaitIndex));

            if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientGaitItemList())){
                for (int itemIndex = 0 ;itemIndex<patientGaitList.get(gaitIndex).getPatientGaitItemList().size();itemIndex++){
                    patientGaitItemMapper.insertSelective(patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex));
                    if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList())){
                        for (int checkIndex = 0 ;checkIndex<patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList().size();checkIndex++){
                            patientGaitCheckMapper.insertSelective(patientGaitList.get(gaitIndex).getPatientGaitItemList().get(itemIndex).getPatientGaitCheckList().get(checkIndex));
                        }
                    }
                }
            }

            if(!CollectionUtils.isEmpty(patientGaitList.get(gaitIndex).getPatientInspectList())){
                for (int itemIndex = 0 ;itemIndex<patientGaitList.get(gaitIndex).getPatientInspectList().size();itemIndex++){
                    patientInspectMapper.insertSelective(patientGaitList.get(gaitIndex).getPatientInspectList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealMedicine(List<PatientMedicine> patientMedicineList){
        for(int combineIndex = 0 ;combineIndex < patientMedicineList.size(); combineIndex ++){
            patientMedicineMapper.insertSelective(patientMedicineList.get(combineIndex));
            if(!CollectionUtils.isEmpty(patientMedicineList.get(combineIndex).getPatientMedicineDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientMedicineList.get(combineIndex).getPatientMedicineDetailList().size(); itemIndex ++){
                    patientMedicineDetailMapper.insertSelective(patientMedicineList.get(combineIndex).getPatientMedicineDetailList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealNerveSleep (List<PatientNerveSleep> patientNerveSleepList) {
        for(int sleepIndex = 0 ; sleepIndex<patientNerveSleepList.size();sleepIndex++){
            patientNerveSleepMapper.insertSelective(patientNerveSleepList.get(sleepIndex));
            if(!CollectionUtils.isEmpty(patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientFieldDetailMapper.insertSelective(patientNerveSleepList.get(sleepIndex).getPatientFieldDetailList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealPhytheTms (List<PatientPhytheTms> patientPhytheTmsList) {
        for(int tmsIndex = 0 ; tmsIndex < patientPhytheTmsList.size(); tmsIndex ++){
            patientPhytheTmsMapper.insertSelective(patientPhytheTmsList.get(tmsIndex));

            if(!CollectionUtils.isEmpty(patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList())){
                for(int itemIndex = 0 ;itemIndex < patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList().size(); itemIndex ++){
                    patientPhytheReactionMapper.insertSelective(patientPhytheTmsList.get(tmsIndex).getPatientPhytheReactionList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealPreopsInfo(List<PatientPreopsInfo> patientPreopsInfoList){
        for(int preIndex = 0 ; preIndex< patientPreopsInfoList.size(); preIndex ++){
            patientPreopsInfoMapper.insertSelective(patientPreopsInfoList.get(preIndex));

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList().size(); itemIndex ++){
                    patientPreopsDiaryMapper.insertSelective(patientPreopsInfoList.get(preIndex).getPatientPreopsDiaryList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList().size(); itemIndex ++){
                    patientPreopsScaleMapper.insertSelective(patientPreopsInfoList.get(preIndex).getPatientPreopsScaleList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList())){
                for(int itemIndex = 0 ;itemIndex < patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList().size(); itemIndex ++){
                    patientPreopsMedicineMapper.insertSelective(patientPreopsInfoList.get(preIndex).getPatientPreopsMedicineList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealScale (List<PatientScale> patientScaleList){
        for(int scaleIndex = 0 ; scaleIndex < patientScaleList.size(); scaleIndex ++){
            patientScaleMapper.insertSelective(patientScaleList.get(scaleIndex));
            if(!CollectionUtils.isEmpty(patientScaleList.get(scaleIndex).getPatientOptionList())){
                for(int itemIndex = 0 ;itemIndex < patientScaleList.get(scaleIndex).getPatientOptionList().size(); itemIndex ++){
                    patientOptionMapper.insertSelective(patientScaleList.get(scaleIndex).getPatientOptionList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientScaleList.get(scaleIndex).getPatientScaleFileList())){
                for(int itemIndex = 0 ;itemIndex < patientScaleList.get(scaleIndex).getPatientScaleFileList().size(); itemIndex ++){
                    patientScaleFileMapper.insertSelective(patientScaleList.get(scaleIndex).getPatientScaleFileList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealVideoInfo (List<PatientVideoInfo> patientVideoInfoList) {
        for(int videoIndex = 0 ; videoIndex < patientVideoInfoList.size(); videoIndex ++){
            patientVideoInfoMapper.insertSelective(patientVideoInfoList.get(videoIndex));
            if(!CollectionUtils.isEmpty(patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList())){
                for(int itemIndex = 0 ;itemIndex < patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList().size(); itemIndex ++){
                    patientAttachmentMapper.insertSelective(patientVideoInfoList.get(videoIndex).getPatientVideoAttachmentList().get(itemIndex));
                }
            }

            if(!CollectionUtils.isEmpty(patientVideoInfoList.get(videoIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientVideoInfoList.get(videoIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientFieldDetailMapper.insertSelective(patientVideoInfoList.get(videoIndex).getPatientFieldDetailList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealVitalSign (List<PatientVitalSign> patientVitalSignList) {
        for(int vitalIndex = 0 ;vitalIndex < patientVitalSignList.size(); vitalIndex ++){
            patientVitalSignMapper.insertSelective(patientVitalSignList.get(vitalIndex));
            if(!CollectionUtils.isEmpty(patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().size(); itemIndex ++){
                    patientVitalSignDetailMapper.insertSelective(patientVitalSignList.get(vitalIndex).getPatientVitalSignDetailList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealMedicineAdverse (List<PatientMedicineAdverse> patientMedicineAdverseList) {
        for(int adverseIndex = 0 ;adverseIndex < patientMedicineAdverseList.size(); adverseIndex ++){
            patientMedicineAdverseMapper.insertSelective(patientMedicineAdverseList.get(adverseIndex));
            if(!CollectionUtils.isEmpty(patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList())){
                for(int itemIndex = 0 ;itemIndex < patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList().size(); itemIndex ++){
                    patientMedicineAdverseMdMapper.insertSelective(patientMedicineAdverseList.get(adverseIndex).getPatientMedicineAdverseMdList().get(itemIndex));
                }
            }
        }
    }

    @Transactional(propagation = Propagation.NESTED,value = "transactionManager")
    public void dealSpephysical (List<PatientSpephysical> patientSpephysicalList) {
        for(int spephysicalIndex = 0 ;spephysicalIndex < patientSpephysicalList.size(); spephysicalIndex ++){
            patientSpephysicalMapper.insertSelective(patientSpephysicalList.get(spephysicalIndex));
            if(!CollectionUtils.isEmpty(patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList())){
                for(int itemIndex = 0 ;itemIndex < patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList().size(); itemIndex ++){
                    patientFieldDetailMapper.insertSelective(patientSpephysicalList.get(spephysicalIndex).getPatientFieldDetailList().get(itemIndex));
                }
            }
        }
    }
}
