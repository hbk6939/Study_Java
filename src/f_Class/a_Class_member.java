public class a_Class_member 
{
	public static void main(String[] args) 
    {
        Car car = new Car("현대차", 2022, "Red");
        System.out.println(car.getModel());
    }
}


class Car
{ // 클래스 이름
    private String modelName; // 필드
    private int modelYear; // 필드
    private String modelColor; // 필드
    
    Car(String modelName, int modelYear, String modelColor)
    { // 생성자
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelColor = modelColor;
    }
    public String getModel()
    { // 메소드
        return this.modelYear + "년식 " + this.modelName + " " + this.modelColor;
    }
}