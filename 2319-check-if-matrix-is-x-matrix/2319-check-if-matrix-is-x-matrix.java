class Solution {
    public boolean checkXMatrix(int[][] a) {
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(i==j || i+j==a.length-1){
                if(a[i][j]==0){
                    return false;
                 }
                  }
                  else{
                    if(a[i][j]!=0){
                        return false;
                    }
                  }
      
        }
    } return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna