/**
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
int minDepth(TreeNode *root)
{
    if (root == nullptr)
        return 0;
    queue<TreeNode *> q;
    q.push(root);
    int dept = 1;
    while (!q.empty())
    {
        int size = q.size();
        TreeNode *tmp;
        for (int i = 0; i < size; i++)
        {
            tmp = q.front();
            q.pop();
            if (tmp->left == NULL && tmp->right == NULL)
                return dept;
            if (tmp->left != nullptr)
                q.push(tmp->left);
            if (tmp->right != nullptr)
                q.push(tmp->right);
        }

        dept++;
    }
    return dept;
}