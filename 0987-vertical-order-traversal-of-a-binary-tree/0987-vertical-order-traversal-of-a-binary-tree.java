class Solution {
    class basic{
        TreeNode node;
        int row;
        int col;
            basic(TreeNode node,int row,int col){
                this.node=node;
                this.row=row;
                this.col=col;
            }
        }
         public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
            Queue<basic>q=new LinkedList<>();
            q.add(new basic(root,0,0));
            while(!q.isEmpty()){
                basic b=q.poll();
                TreeNode node=b.node;
                int row=b.row;
                int col=b.col;
                map.putIfAbsent(col,new TreeMap<>());
                map.get(col).putIfAbsent(row,new PriorityQueue<>());
                map.get(col).get(row).add(node.val);
                if(node.left!=null){
                    q.add(new basic(node.left,row+1,col-1));
                }
                if(node.right!=null){
                    q.add(new basic(node.right,row+1,col+1));
                }
            }
            List<List<Integer>> result=new ArrayList<>();
            for(TreeMap<Integer,PriorityQueue<Integer>> rows : map.values()){
                List<Integer> list = new ArrayList<>();
                for(PriorityQueue<Integer> pq : rows.values()){
                    while(!pq.isEmpty()){
                        list.add(pq.poll());
                    }
                }
                result.add(list);
            }
            return result;
        }
        
    }
