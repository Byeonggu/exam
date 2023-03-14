import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for(int i = 0; i<N; i++){
            String[] input = br.readLine().split(" ");

            tree.createNode(input[0], input[1], input[2]);
        }

        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
        System.out.println();
    }
}

class Tree{
	//트리의 뿌리 노드
    Node root = new Node(".");

    //미드값 왼쪽 오른쪽 받고 노드 만들기
    void createNode(String mid, String left, String right){
    	//뿌리 노드에서 데이터가 없다면
        if(root.data.equals(".")){
        	//매개변수 mid가 존재한다면
            if(!mid.equals("."))
            	//root node의 값은 mid
                root = new Node(mid);
            
            //레프트 매개변수가 존재한다면
            if(!left.equals("."))
            	//뿌리 LEFt에 새로운 노드(left의 값을 갖는) 생성
                root.left = new Node(left);
            if(!right.equals("."))
            	//뿌리 right에 새로운 노드(right의 값을 갖는) 생성
                root.right = new Node(right);
        }
        //뿌리노드에 데이터가 있다면 find메서드 실행
        else find(root, mid, left, right);
    }

    void find(Node node, String mid, String left, String right){
        if(node == null)
            return;

        else if(mid.equals(node.data)){
            if(!left.equals("."))
                node.left = new Node(left);
            if(!right.equals("."))
                node.right = new Node(right);
        }

        find(node.left, mid, left, right);
        find(node.right, mid, left, right);
    }

    void preOrder(Node node){
        System.out.print(node.data);

        if(node.left != null)
            preOrder(node.left);

        if(node.right != null)
            preOrder(node.right);
    }

    void inOrder(Node node){
        if(node.left != null)
            inOrder(node.left);

        System.out.print(node.data);

        if(node.right != null)
            inOrder(node.right);
    }

    void postOrder(Node node){
        if(node.left != null)
            postOrder(node.left);

        if(node.right != null)
            postOrder(node.right);

        System.out.print(node.data);
    }
}

class Node{
    String data;
    Node left, right;

    Node(String data){
        this.data = data;
    }
}