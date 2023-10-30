class TestArray{
	public static void main(String[] args) {
		Student[] arr ={new Student("Muneeb"), new Student("Mateen"), new Student("Mustafa")};
		// System.out.println(arr);
		// System.out.println(arr[0]);
		// arr[0] = new Student();
		// System.out.println(arr[0]);


		// Student obj = new Student();

		// System.out.println(arr[2]);
		for (Student temp : arr) {
			System.out.println(temp);
		}

	}
}