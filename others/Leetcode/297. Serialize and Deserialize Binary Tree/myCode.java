class myCode {
    private String mark = ",";
    private String nn = "N";
    
    public static void main (String[] args) throws java.lang.Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        myCode test = new myCode();
        
        String ans = test.serialize(root);
        System.out.println(ans);

    }
   

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root,sb);
        return sb.toString();
        
    }
    private void buildString(TreeNode root, StringBuilder sb){
        if( root == null ) sb.append(nn).append(mark);
        else{
            sb.append(root.val).append(mark);
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> deque  = new  LinkedList<>();
        deque.addAll(Arrays.asList(data.split(mark)));
        return buildTree(deque);
    }
    private TreeNode buildTree(Deque<String> deque){
        String root = deque.remove();
        if(root.equals(nn)) return null;
        else{ 
            TreeNode node = new TreeNode(Integer.valueOf(root));
            node.left = buildTree(deque);
            node.right = buildTree(deque);
            return node;
        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}