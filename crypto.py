print("33_ITB_Ekta singh")
def encrypted (string,shift):
    ciper=''
    for char in string:
        if char=='':
            ciper=ciper+char
        elif char.isupper():
            ciper=ciper+chr((ord(char)+shift-65)%26+65)
        else :
            ciper=ciper+chr((ord(char)+shift-97)%26+97)
    return ciper
   
def decrypted (x,shift):
    ciper=''
    for char in x:
        if char=='':
            ciper=ciper+char
        elif char.isupper():
            ciper=ciper+chr((ord(char)-shift-65)%26+65)
        else :
            ciper=ciper+chr((ord(char)-shift-97)%26+97)
    return ciper
text=input("enter the text")
s=int(input("enter the shift key"))
print("the orignal text message was= ",text)
x=encrypted(text,s)
print("the encrypted text message is= ",encrypted(text,s) )
print("the decrypted text message is= ",decrypted(x,s) )
