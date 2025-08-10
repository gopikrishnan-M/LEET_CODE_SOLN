public class Codec {

    // Encodes a tree to a single string.
    List<String> ans = new ArrayList<>();

    public String serialize(TreeNode root) {
        ans.clear(); // avoid leftover data between calls
        serihelper(root);
        return String.join(",", ans);
    }

    private void serihelper(TreeNode root) {
        if (root == null) {
            ans.add("null");
            return;
        }
        ans.add(String.valueOf(root.val));
        serihelper(root.left);
        serihelper(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        Collections.reverse(list); // so we can pop from the end
        return helper(list);
    }

    private TreeNode helper(List<String> list) {
        String val = list.remove(list.size() - 1);
        if (val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper(list);
        node.right = helper(list);
        return node;
    }
}
