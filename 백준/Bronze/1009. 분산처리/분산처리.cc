#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    for (int i = 0; i < N; i++) {
        int a, b, result = 1;
        // 두 입력을 동시에 받을땐
        // cin >> x >> y; 형식으로
        // 사용할 수 있다.
        cin >> a >> b;
        
        for (int i = 0; i < b; i++) {
            // 예제 입력이 7 100 일 경우
            // 7의 100승은 너무 크기 때문에
            // pow 함수를 사용하는 것은 무리가 있다.
            
            // 1의 자리만 알면 되기 때문에
            // 제곱한 수를 다시 10으로 나눠
            // 1의 자리만 계속 알 수 있도록 계산한다.
            result = (result * a) % 10;
        }
        
        // case가 2가지 경우인 경우,
        // if문 보다는 3항 연산자를 통해 답을 출력한다.
        cout << ((result == 0) ? 10 : result) << endl;
    }

    return 0;
}