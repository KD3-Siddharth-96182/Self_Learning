#include <iostream>
using namespace std;

int my_strlen(const char *str)
{
    int count = 0;
    while (str[count] != '\0')
        count++;
    return count;
}

void my_strcpy(char *dest, const char *src)
{
    int i = 0;
    while (src[i] != '\0')
    {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';
}

int main()
{
    char src[100], dest[100];

    cin >> src;

    cout << my_strlen(src) << endl;

    my_strcpy(dest, src);

    cout << dest << endl;

    return 0;
}