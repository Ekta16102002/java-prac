print("33_ITB_EKTA SINGH")
class Queue:
    q=[]
    rear=0
    front=0
    maxsize=0
    def createqueue(self,size):
        Queue.rear=-1
        Queue.front=0
        Queue.maxsize=size
        for i in range(size):
            Queue.q.append(0)
        print("Queue Created of size:",len(Queue.q))
        print(Queue.q)
    
    def enqueue(self,ele):
        Queue.rear+=1
        Queue.q[Queue.rear]=ele
        print("Element is Enqueue in Queue:",ele)
    
    def dequeue(self):
        t=Queue.q[Queue.front]
        Queue.front+=1
        return(t)
    
    def isQueuefull(self):
        if Queue.rear==Queue.maxsize-1:
            return True
        else:
            return False
        
    def isEmpty(self):
        if Queue.rear<Queue.front:
            return True
        else:
            return False
        
    def printQueue(self):
        for i in range(Queue.front,Queue.rear+1,1):
            print(Queue.q[i])
            
obj=Queue()
obj.createqueue(int(input("Enter size of Queue:")))
while True:
    print("1.Enqueue\n2.Dequeue\n3.Print\n4.Exit")
    ch=int(input("Enter choice:"))
    
    if ch==1:
        if obj.isQueuefull()!=True:
            data=int(input("Enter Data: "))
            obj.enqueue(data)
        else:
            print("Queue is Full." )
    elif ch==2:
        if obj.isEmpty()!=True:
            print("Element is Dequeue:",obj.dequeue())
        else:
            print("Queue Empty.")
    elif ch==3:
        if obj.isEmpty()!=True:
            print("Element in Queue:")
            obj.printQueue()
        else:
            print("Queue Empty.")
    elif ch==4:
        print("Exit:")
        print("by EKTA SINGH")
        break
    else:
        print("Wrong input.")