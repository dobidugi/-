int prime(int n) {
	int flag = 1;
	for (int i = 2; i < n; i++) {
		if (n%i == 0) {
			flag = 0;
			break;
		}
	}
	return flag;

} 