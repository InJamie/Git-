package pers.jamie.temp;

import pers.jamie.Util.BusiUtil;
import pers.jamie.domain.MbBatchOpenDctDetails;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class temp003 {
    public static void main(String[] args) throws Exception {
        Map<String,String> diffNameMap = new HashMap();
        List newData = new ArrayList();
        newData.add(new MbBatchOpenDctDetails("101","123321","小刘"));
        newData.add(new MbBatchOpenDctDetails("102","123321","小刘"));
        newData.add(new MbBatchOpenDctDetails("104","123321","小刘"));

        diffNameMap.get(null);
        int num = 0;//计数器
        for (Object mbBatchOpen:newData
             ) {
           MbBatchOpenDctDetails mbBatchOpenDctDetails = (MbBatchOpenDctDetails) mbBatchOpen;
        String key = "";
        if("101".equals(mbBatchOpenDctDetails.getDocumentType())||"102".equals(mbBatchOpenDctDetails.getDocumentType())||"104".equals(mbBatchOpenDctDetails.getDocumentType())){
            key = "sameDocument"+mbBatchOpenDctDetails.getDocumentId();
        }else {
            key = mbBatchOpenDctDetails.getDocumentType() + mbBatchOpenDctDetails.getDocumentId();
        }
            boolean notNull = !BusiUtil.isNull(diffNameMap.get(key));
            boolean equals = BusiUtil.isEquals(mbBatchOpenDctDetails.getChClientName(), (diffNameMap.get(key)));
            if (!BusiUtil.isNull(diffNameMap.get(key))&&!BusiUtil.isEquals(mbBatchOpenDctDetails.getChClientName(),(diffNameMap.get(key)))) {
            throw new Exception("RB3309");
        }
        diffNameMap.put(key,mbBatchOpenDctDetails.getChClientName());
            System.out.println(++num);
    }
    }

}
