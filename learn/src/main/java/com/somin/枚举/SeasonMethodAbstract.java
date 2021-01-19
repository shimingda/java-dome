package com.somin.枚举;

public enum SeasonMethodAbstract
{
	//必须存在
	SPRING (1,"春天","春暖花开") {
				@Override
				public void activity() {
					System.out.println("春游爬山");
				}
			},
	SUMMER (2,"夏天","夏雨雨人"){
		@Override
		public void activity()
		{
			System.out.println("夏天游泳");
		}
	},
	AUTUMN (3,"秋天","秋高气爽") {
				@Override
				public void activity() {
					System.out.println("秋天赏月");
				}
			},
	WINTER (4,"冬天","冬日暖阳") {
				@Override public void activity() {
					System.out.println("冬天滑雪");
				}
			};

	public final int type;
	public final String name;
	public final String desc;

	SeasonMethodAbstract(int type,String name, String desc) {
		this.type = type;
		this.name = name;
		this.desc = desc;
	}

	public abstract void activity();

	public static SeasonMethodAbstract of(int type) throws Exception
	{
		for (SeasonMethodAbstract season : SeasonMethodAbstract.values()) {
			if(type==season.type){
				return season;
			}
		}
		throw new Exception("没有找到对应类型:"+type);
	}
}
