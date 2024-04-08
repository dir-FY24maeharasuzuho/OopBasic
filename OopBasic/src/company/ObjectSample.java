package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木",department,"課長",100);
        
        // インスタンスメソッドの呼び出し
        employee.report(); //引数のないreport()メソッドの呼び出し
        employee.report(2); //引数を持つreport(times)メソッドの呼び出し
        employee.joinMeeting();
        
        //1行開ける
        System.out.println("");
        
        //インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中",devDepartment,"一般社員",88,"Java");
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        //インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if(projectManager instanceof Engineer){
            //developSoftwareメソッドを呼び出す
            ((Engineer)projectManager).developSoftware();
        }

    }

}
