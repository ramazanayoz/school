###########3inkedlistpart
import re

class Node :
    def __init__( self, data ) :
        self.data = data
        self.next = None
        self.prev = None



class LinkedList :
    def __init__( self ) :
        self.head = None
        self.ilk = None

    def add( self, data ) :
        node = Node( data )
        if self.ilk == None :
            self.head = node
            self.ilk = node
        else :

            self.head.next=node
            self.head = node


    def search( self, k ) :
        p = self.head
        if p != None :
            while p.next != None :
                if ( p.data == k ) :
                    return p
                p = p.next
            if ( p.data == k ) :
                return p
        return None

    def get ( self, k ) :
        var = 0
        p = self.ilk

        if p != None :
            while p.next != None :
                if ( var == k ) :
                    return p.data
                p = p.next
                var = var+1
            if ( var == k ) :
                return p.data
        return None

    def remove( self, p ) :
        tmp = p.prev
        p.prev.next = p.next
        p.prev = tmp

    def __str__( self ) :
        s = ""
        p = self.head
        if p != None :
            while p.next != None :
                s += p.data
                p = p.next
            s += p.data
        return s



###################main

mylinkedlist = LinkedList()
mylinkedlist2 = LinkedList()

###################################################################################3
#############file = open("C:\Users\eayoz\Desktop\pl project final\pl_homework\java\plhw", "r")
################################################################################
exp = re.compile(r'^[\+,\-]?[0-9]{1,3}$')

with open("plhw") as f:
    for line in f:
        if re.match(exp, line.strip()):
            myInput = int(line)
            mylinkedlist.add(myInput)



with open("plhw2") as f:
    for line in f:
        if re.match(exp, line.strip()):
            myInput = int(line)
            mylinkedlist2.add(myInput)

    i = 0
    b= True
    while b:
        if(mylinkedlist.get(i)==None or mylinkedlist2.get(i)==None):
            break
        result = mylinkedlist.get(i) * mylinkedlist2.get(i)
        print(result)
        i += 1
