class Solution {
public:
    string removeOuterParentheses(string s) {
//         int depth=0;
//         string result;
//          for(char c: s){
//                if(c=='('){
//                     if(depth>0){
//                         result+=c;
//                     }
//                     depth++;
//                } else{// c==')
//                 depth--;
//                 if(depth>0){
//                     result+=c;
//                 }
//                }
//             }
//     return result;
//     }

    int depth=0;
    string res;
    res.reserve(s.size()); // avoid reallocations
    for(char c: s){
        if(c=='(' && depth++> 0)  res+=c;
        if(c==')' && --depth > 0) res+=c;
    }
    return res;
    }
};