
 # ����˵��
 
 ## �漰���������ĸ�����ơ��������
 
 ### interface
 
 ZhenInterface:���ֲ�����ZhenChangshe,ZhenHeyi,ZhenYanhang����ʵ�ָýӿ�  
 
 Creature:���������Huluwa��Grandpa,xiezijing����ʵ�ָýӿ�  
 
 Sorter:���򷽷���BubbleSorter����ʵ�ָýӿ�  
 
 Comparable���Ƚ϶������ʵ�ָýӿ�  
 
 �ӿڵĺô���������ӿڱ�̡���ʵ�ּ���ԭ��Ĺؼ��������ھۣ�����ϡ�  
 

 
 ### ��̬
 
 ```
 
 Creature[] monster=new Creature[7];
 monster[0]=new Xiezijing();
 for(int i=1;i<7;i++){
        monster[i]=new Xiaolouluo();
}
        
 
 ```
 Creature�ǽӿڣ�Creature[] monster=new Creature[7];�����䶨����һ��ʵ�ֽӿڵ���Ķ������飬
 ����monster[0]=new Xiezijing();ʵ����ָ��Ķ���ʱxiezijing���󣬴˴�����̬�������˼̳�+��д+
 ��������ָ��������������������  
 �ô���������ߴ���������ԣ���������Ϊ�������Ĳ�������������Ӱ�졣
 
  ### ���ʿ���
 
 �󲿷ֵ����ݳ�Ա�ķ��ʿ���Ϊprivat���������ݷ�װ��ͬʱ�������ṩ��set��get����