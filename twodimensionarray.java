 class twodimensionarray {
  public static void main(String[] args) {
    

    int[][] arr = new int[5][5];
    for (int i = 1; i < arr.length; i++) {
        for (int j = 1; j < arr[i].length; j++) {
            arr[i][j] = j;
            System.out.print(arr[i][j] + " ");
        }
        System.out.println("");
    }

}
}