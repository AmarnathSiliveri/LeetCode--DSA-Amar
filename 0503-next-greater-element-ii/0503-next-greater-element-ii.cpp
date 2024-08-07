class Solution {
public:
    vector<int> nextGreaterElements(vector<int> a) {
        int n=a.size();
        vector<int>res(a);
        vector<int>da(2*n);
        for (int i=0;i<n;i++)da[i+n]=da[i]=a[i];

        int n2=da.size();
        for (int i=0;i<n;i++)
        {
            res[i]=-1;
            for (int j=i+1;j<n2;j++)
            {
                if(da[j]>a[i])
                {
                    res[i]=da[j];
                    break;
                }
            }
        }
        return res;
    }
    
};