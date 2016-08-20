package sec05.exam03_anonymous_local_variable;

public class Anonymous {
	private int field;
	
		public void method(final int arg1, int arg2) {
			final int var1 = 0;
			int var2 = 0;
			
			field = 10;
			
			//arg1 = 20; 		//(x), final�� �ǹ����� �� �ٲ�
			//arg2 = 20;		//(x), �ؿ��� �͸� ��ü���� ������ ����ϹǷ�, final�� �Ź���
			
			//var1 = 30; 		//(x)
			//var2 = 30;		//(x)
			
			Calculable calc = new Calculable() {
				@Override
				public int sum() {
					int result = field + arg1 + arg2 + var1 + var2;
					return result;
				}
			};
			
			System.out.println(calc.sum());
		}
}
