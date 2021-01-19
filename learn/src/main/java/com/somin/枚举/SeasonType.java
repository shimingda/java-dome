package com.somin.枚举;

public enum SeasonType {
	//必须存在
	SPRING (1,"春天","春暖花开"),
	SUMMER (2,"夏天","夏雨雨人"),
	AUTUMN (3,"秋天","秋高气爽"),
	WINTER (4,"冬天","冬日暖阳");

	public final int type;
	public final String name;
	public final String desc;

	SeasonType(int type,String name, String desc) {
		this.type = type;
		this.name = name;
		this.desc = desc;
	}
	//责任链
	public static SeasonType of(int type) throws Exception
	{
		for (SeasonType season :SeasonType.values()) {
			if(type==season.type){
				return season;
			}
		}
		throw new Exception("没有找到对应类型:"+type);
	}
}
