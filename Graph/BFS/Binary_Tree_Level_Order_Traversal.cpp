/**
 * level order traversal in Binary Tree
 */

#include<bits/stdc++.h>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

vector<vector<int>> levelOrder(TreeNode* root) {
         vector<vector<int>> vc;
        if(root==nullptr) return vc;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            TreeNode* tmp;
            vector<int> v;
            int size = q.size();
            for(int i=0;i<size;i++){
                tmp = q.front();
                q.pop();
                v.push_back(tmp->val);
                if(tmp->left!=NULL) q.push(tmp->left);
                if(tmp->right!=NULL) q.push(tmp->right);
            }
            if(!v.empty()) vc.push_back(v);
        }
        return vc;
    }
void printLevelOrder(TreeNode* root){
    vector<vector<int>> vc = levelOrder(root);
    for(int i=0;i<vc.size();i++){
        for(int j:vc[i]){
            cout<<j<<" ";
        }
        cout<<endl;
    }
}
int main(){
    TreeNode *root = new TreeNode(1); 
    root->left = new TreeNode(2); 
    root->right = new TreeNode(3); 
    root->left->left = new TreeNode(4); 
    root->left->right = new TreeNode(5); 
 
    cout << "Level Order traversal of binary tree is \n"; 
    printLevelOrder(root); 
}