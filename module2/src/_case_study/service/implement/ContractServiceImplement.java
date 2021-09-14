package _case_study.service.implement;

import _case_study.model.Contract;
import _case_study.service.ContractService;
import _case_study.utils.ReadFile;

import java.util.Set;


public class ContractServiceImplement implements ContractService {

    @Override
    public void add(String path) {

    }

    @Override
    public void display(String path) {
        Set<Contract> contractSet = ReadFile.getContractSet(path);
        for(Contract contract:contractSet){
            System.out.println(contract.toString());
        }
    }

    @Override
    public void edit(String path) {

    }


}
