package org.nhnacademy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class Problem2 {

    private static final Logger logger = LoggerFactory.getLogger(Problem2.class);

    public static void main(String[] args) {


        int result=0;

        for(int i=0;i<2;i++){
            int num=(int)(Math.random()*6+1);

            logger.info("{} 번째 주사위는 {}입니다",i+1,num);
            result+=num;

        }

        logger.info("총 주사위 값은 {}입니다",result);




    }

}
