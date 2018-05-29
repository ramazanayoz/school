#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <float.h>

typedef enum DataType { INTEGER, FLOAT_POINT, STRING } DataType ;

typedef union DataValue
{
    int v_int;
    float v_float;
    char* v_string;
}DataValue;

typedef struct DataNode
{
    DataType type;
    DataValue value;
}DataNode;

int main ( void ){

    float temp=0.004;
    DataNode inputData;

    inputData.type= STRING;

    switch(inputData.type)
    {
        case INTEGER: inputData.value.v_int = (int)temp; break;
        case FLOAT_POINT: inputData.value.v_float = (float)temp; break;
        case STRING: inputData.value.v_string = (char*)(&temp); break;
    }
printf("I am a ");
   switch(inputData.type){
       case INTEGER: printf("Integer with value %d", inputData.value.v_int); break;
       case FLOAT_POINT: printf("Float with value %f", inputData.value.v_float); break;
       case STRING: printf("String with value %s", inputData.value.v_string); break;
   }


return 0;
}
