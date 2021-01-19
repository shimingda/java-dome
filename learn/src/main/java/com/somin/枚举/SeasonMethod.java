package com.somin.枚举;

public enum SeasonMethod
{
	//必须存在
	SPRING (1,"春天","春暖花开") ,
	SUMMER (2,"夏天","夏雨雨人"){
		@Override
		public void temp() {
			System.out.println("白天比较长");
		}
	},
	AUTUMN (3,"秋天","秋高气爽") ,
	WINTER (4,"冬天","冬日暖阳") ;

	public final int type;
	public final String name;
	public final String desc;

	SeasonMethod(int type,String name, String desc) {
		this.type = type;
		this.name = name;
		this.desc = desc;
	}
	public void time(){
		System.out.println(name+"24小时");
	}

	public void temp(){};

	public static SeasonMethod of(int type) throws Exception
	{
		for (SeasonMethod season : SeasonMethod.values()) {
			if(type==season.type){
				return season;
			}
		}
		throw new Exception("没有找到对应类型:"+type);
	}
}
