package sec01.exam02_variable_scope;

public class VariableScopeExample {
	public static void main(String[] arts){
		int v1 = 15;
		if(v1>10){
			int v2 = v1 - 10;
		}
		// int v3 = v1 + v2 + 5; //v2 ������ ����� �� ���� ������ ������ ������ ����
	}

}
