


/*
3. Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, 
	edit functionality in a menu driven program. 
	Refer hint below for edit/update
	functionality:
	
	System.out.println("Enter emp id to be modified: ");
	int id = sc.nextInt();
	Employee key = new Employee();
	key.setId(id);
	int index = list.indexOf(key);
	if(index == -1)
	System.out.println("Employee not found.");
	else {
	Employee oldEmp = list.get(index);
	System.out.println("Employee Found: " + oldEmp);
	System.out.println("Enter new information for the Employee");
	Employee newEmp = new Employee();
	newEmp.accept();
	list.set(index, newEmp);
}
*/