// #include <stdio.h>

// int main() {
//     printf("I hope Torvalds is proud\n");
//     return 0;
// }
// #include <stdio.h>
// #include <math.h>

// int main() {
//     float radius, area;
//     printf("Enter the radius of the circle: ");
//     scanf("%f", &radius);
//     area = M_PI * radius * radius;
//     printf("The area of the circle is: %.2f\n", area);
//     return 0;
// }
#include <stdio.h>

int main() {
    float radius, area;
    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);
    area = 3.14159 * radius * radius;
    printf("The area of the circle is: %.2f\n", area);
    return 0;
}