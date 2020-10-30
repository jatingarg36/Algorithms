/** 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
#include<bits/stdc++.h>
using namespace std;
struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

bool isreversed(TreeNode *left, TreeNode *right)
{
    if (left == NULL && right == NULL)
        return true;
    if (left == NULL || right == NULL)
        return false;

    return (left->val == right->val) && isreversed(left->left, right->right) && isreversed(right->left, left->right);
}

bool isSymmetric(TreeNode *root)
{
    return isreversed(root, root);
}
int main()
{
    cout<<"Hello World";
    TreeNode *root        = new TreeNode(1); 
    root->left        = new TreeNode(2); 
    root->right       = new TreeNode(2); 
    root->left->left  = new TreeNode(3); 
    root->left->right = new TreeNode(4); 
    root->right->left  = new TreeNode(4); 
    root->right->right = new TreeNode(3); 

    cout<<isSymmetric(root);
}