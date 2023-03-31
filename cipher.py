text=input("enter the text")
LETTERS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

for k in range(len(LETTERS)):  
   transformation = ''  
   for s in text:  
      if s in LETTERS:  
         n = LETTERS.find(s)  
         n = n - k  
         if n < 0:  
            n = n + len(LETTERS)  
         transformation = transformation + LETTERS[n]  
 
      else:  
         transformation = transformation + s  
   print('key could be #%s: %s' % (k, transformation))  
