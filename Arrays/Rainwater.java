public class Rainwater{
    public static int trapped( int height[]){
        // leftmaxBoundary-array
        int leftmax[] = new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        // rightmaxBoundary-array
        int rightmax[] = new int[height.length];
        rightmax [height.length-1]= height[height.length-1];
        for(int i=height.length-2;i >=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        // loop
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            // water level =min(leftmaxBoundary,rightmaxBoundary)
            int waterlevel=Math.min( rightmax[i],leftmax[i]);
            // trapped water = waetr level - height[i]
            trappedwater +=waterlevel - height[i];
            System.out.print("trapped water ="+ trappedwater);
        }
        
        
        return trappedwater;

    }
    
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trapped(height);

    }
}