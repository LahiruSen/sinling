 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B S c o r i n g A l g o r i t h m R e g i s t r y ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   K n o w l e d g e B a s e M a n a g e r   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
 	  
 	 p r i v a t e   s t a t i c   f i n a l   s h o r t   F O R M _ T Y P E _ M A X   =   2 0 ;  
 	 p r i v a t e   s t a t i c   f i n a l   s h o r t   F O R M _ S U B _ T Y P E _ M A X   =   2 0 ;  
 	  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         { 	 	 	  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 {  
 	 	 	 T a k e A c t i o n ( o R e q ,   o R e s ) ;  
 	 	 }  
         }  
 	  
 	 p u b l i c   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 d o G e t ( o R e q ,   o R e s ) ;          
         }  
 	  
 	 p r i v a t e   L i s t < H B I r r e g u l a r F o r m >   G e t E x c e p t i o n a l F o r m s ( H t t p S e r v l e t R e q u e s t   o R e q )  
 	 {  
 	 	 L i s t < H B I r r e g u l a r F o r m >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	  
 	 	 t r y  
 	 	 {  
 	 	 	 f o r ( s h o r t   i = 0 ;   i < F O R M _ T Y P E _ M A X ;   i + + ) 	 	  
 	 	 	 {  
 	 	 	 	 f o r ( s h o r t   j = 0 ;   j < F O R M _ S U B _ T Y P E _ M A X ;   j + + )  
 	 	 	 	 {  
 	 	 	 	 	 S t r i n g   s P a r a m   =   " F "   +   i   +   j ;  
 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " K n o w l e d g e B a s e M a n a g e r : G e t E x c e p t i o n a l F o r m s   :   "   +   s P a r a m ) ;  
 	 	 	 	 	  
 	 	 	 	 	 S t r i n g   s S e l e c t e d   =   o R e q . g e t P a r a m e t e r ( " c " +   s P a r a m ) ;  
 	 	 	 	 	  
 	 	 	 	 	 i f ( s S e l e c t e d ! = n u l l )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 S t r i n g   s E x c e p t i o n   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " t " +   s P a r a m ) ) ;  
 	 	 	 	 	 	  
 	 	 	 	 	 	 i f ( s E x c e p t i o n ! = n u l l )  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n e w   H B I r r e g u l a r F o r m ( s E x c e p t i o n ,   i ,   j ) ;  
 	 	 	 	 	 	 	 l i s t F o r m s . a d d ( o F o r m ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 } 	  
 	 	 	 } 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E r r o r   :   K n o w l e d g e B a s e M a n a g e r   :   G e t E x c e p t i o n a l F o r m s   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 }  
 	 	 r e t u r n   l i s t F o r m s ;  
 	 }  
  
 	  
 	 p r i v a t e   v o i d   T a k e A c t i o n ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
 	 {  
         	 S t r i n g   s L e m m a   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " h L e m m a " ) ) ;  
         	 S t r i n g   s R u l e S e t   =   o R e q . g e t P a r a m e t e r ( " h R u l e S e t " ) ;  
         	  
         	 S t r i n g   s C o n f   =   o R e q . g e t P a r a m e t e r ( " t C o n f " ) ;  
         	 S t r i n g   s O v e r w i t e   =   o R e q . g e t P a r a m e t e r ( " t O v e r w r i t e " ) ;  
         	 S t r i n g   s S o u r c e P a g e   =   o R e q . g e t P a r a m e t e r ( " h S o u r c e P a g e " ) ;  
         	 S t r i n g   s L e m m a T y p e   =   o R e q . g e t P a r a m e t e r ( " h L e m m a T y p e " ) ;  
  
 	 	 s h o r t   i L e m m a T y p e   =   H B L e m m a . L E M M A _ T Y P E _ N O U N ;    
 	 	  
 	 	 i f ( s L e m m a T y p e ! = n u l l   & &   s L e m m a T y p e ! = " " )  
 	 	 {  
 	 	 	 i L e m m a T y p e   =   S h o r t . p a r s e S h o r t ( s L e m m a T y p e ) ;  
 	 	 }  
 	 	         	  
         	 s h o r t   i R u l e S e t   =   0 ;  
         	  
         	 i f ( s C o n f ! = n u l l )  
         	 {  
         	 	 i f ( s L e m m a ! = n u l l   & &   s L e m m a ! = " "   & &   s R u l e S e t ! = n u l l   & &   s R u l e S e t ! = " " )  
         	 	 {  
         	 	 	 i R u l e S e t   =   S h o r t . p a r s e S h o r t ( s R u l e S e t ) ;     	 	 	  
         	 	 	  
         	 	 	 H B K n o w l e d g e B a s e . C o n f i r m M o r p h i n g ( s L e m m a ,   i L e m m a T y p e ,   ( s h o r t ) 0 ,   i R u l e S e t ,   A d m i n L o g i n . G e t U s e r I D ( o R e q ) ) ;  
         	 	 	  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " R u l e   S e t   C o n f i r m e d   :   L e m m a = "   +   s L e m m a   +   "   :   R u l e S e t = "   +   i R u l e S e t ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " E r r o r   :   N o   D a t a   t o   C o n f i r m   L e m m a " ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 }  
         	 e l s e   i f ( s O v e r w i t e ! = n u l l )  
         	 {  
         	 	 i f ( s L e m m a ! = n u l l   & &   s L e m m a ! = " " )  
         	 	 { 	  
         	 	 	 L i s t < H B I r r e g u l a r F o r m >   l i s t E x c e p t i o n s   =   G e t E x c e p t i o n a l F o r m s ( o R e q ) ;  
         	 	 	 S t r i n g   s M s g   =   " " ;  
         	 	 	 i n t   i C o u n t   =   l i s t E x c e p t i o n s . s i z e ( ) ;  
         	 	 	 l o n g   i L e m m a I D   =   0 ;  
         	 	 	 i f ( i C o u n t   >   0 )  
         	 	 	 {  
         	 	 	 	 i L e m m a I D   =   H B K n o w l e d g e B a s e . C o n f i r m L e m m a I D ( s L e m m a ,   i L e m m a T y p e ,   ( s h o r t ) 0 ) ;         	 	 	 	       	 	 	 	  
         	 	 	 }  
         	 	 	  
         	 	 	 i f ( i L e m m a I D > 0 )  
         	 	 	 {       	 	 	  
 	                 	 	 i f ( s R u l e S e t ! = n u l l   & &   s R u l e S e t ! = " " )  
 	                 	 	 { 	  
 	                 	 	 	 s h o r t   i O l d R u l e I d   =   H B K n o w l e d g e B a s e . G e t M o r p h R u l e I D ( i L e m m a I D ,   i L e m m a T y p e ,   ( s h o r t ) 0 ) ;  
 	                 	 	 	  
 	                 	 	 	 i f ( i O l d R u l e I d < = 0 )  
 	                 	 	 	 {  
 	                 	 	 	 	 i R u l e S e t   =   S h o r t . p a r s e S h o r t ( s R u l e S e t ) ;  
 	                 	 	 	 	 H B K n o w l e d g e B a s e . C o n f i r m M o r p h i n g ( s L e m m a ,   i L e m m a T y p e ,   ( s h o r t ) 0 ,   i R u l e S e t ,   A d m i n L o g i n . G e t U s e r I D ( o R e q ) ) ;  
 	                 	 	 	 	 s M s g   =   " R u l e   S e t   C o n f i r m e d   :   L e m m a = "   +   s L e m m a   +   "   :   R u l e S e t = "   +   i R u l e S e t   +   " < b r > " ;  
 	                 	 	 	 } 	                 	 	 	 	  
 	                 	 	 	 e l s e  
 	                 	 	 	 {  
 	                 	 	 	 	 / / T O D O   d e l e t e   a n d   r e - i n s e r t  
 	                 	 	 	 	 s M s g   =   " R u l e   S e t   "   +   i O l d R u l e I d   +   "   h a s   a l r e a d y   b e e n   c o n f i r m e d   f o r   L e m m a   [ "   +   s L e m m a   +   " ]   N e w   R u l e   S e t   "   +   i R u l e S e t   +   "   i g n o r e d .   < b r > " ;  
 	                 	 	 	 	 / / H B K n o w l e d g e B a s e . C o n f i r m M o r p h i n g ( s L e m m a ,   i L e m m a T y p e ,   ( s h o r t ) 0 ,   i R u l e S e t ,   A d m i n L o g i n . G e t U s e r I D ( o R e q ) ) ;  
 	                 	 	 	 }               	 	 	 	                 	 	 	  
 	                 	 	 	  
 	                 	 	 }  
 	                 	 	 e l s e  
 	                 	 	 {  
 	                 	 	 	 s M s g   =   " R u l e   S e t   C o n f i r m a t i o n   F a i l e d   f o r   L e m m a   [ "   +   s L e m m a   +   " ]   :   R u l e S e t = n u l l < b r > " ;  
 	                 	 	 }  
 	         	 	 	  
 	         	 	 	 s M s g   =   s M s g   +   i C o u n t   +   "   e x c e p t i o n s   a d d e d   t o   t h e   L e m m a   [   " +   s L e m m a   +   "   :   "   +   i L e m m a I D   +   " ] < b r > " ;  
 	         	 	 	  
 	         	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	         	 	 	 {  
 	         	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   l i s t E x c e p t i o n s . g e t ( i ) ;  
 	         	 	 	 	 s M s g   =   s M s g   +   " F o r m   T y p e = "   +   o F o r m . G e t T y p e ( )     +   "   :   F o r m   S u b   T y p e = "   +   o F o r m . G e t S u b T y p e ( )   +   "   :   W o r d = "   +     o F o r m . G e t N a t u r a l F o r m ( )   +   " < b r > " ;  
 	         	 	 	 	         	 	 	 	  
 	         	 	 	 	 H B K n o w l e d g e B a s e . A d d E x c e p t i o n ( i L e m m a I D ,   o F o r m . G e t T y p e ( ) ,   o F o r m . G e t S u b T y p e ( ) ,   o F o r m . G e t N a t u r a l F o r m ( ) ,   A d m i n L o g i n . G e t U s e r I D ( o R e q ) ) ;         	 	 	 	  
 	         	 	 	 }  
 	         	 	 	  
 	         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   s M s g ,   s S o u r c e P a g e ) ;  
         	 	 	 }  
         	 	 	 e l s e  
         	 	 	 {  
         	 	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " I n v a l i d   L e m m a   :   "   +   s L e m m a   +   "   :   I D = "   +   i L e m m a I D   +   "   :   E x c e p t i o n   C o u n t = "   +   i C o u n t ,   s S o u r c e P a g e ) ;  
         	 	 	 }  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " N o   D a t a   t o   O w e r w r i t e L e m m a " ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 }         	  
         	 e l s e  
         	 {  
         	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " N o   V a l i d   A c t i o n " ,   s S o u r c e P a g e ) ;  
         	 }       	  
         	  
 	 }  
 	  
         p r i v a t e   v o i d   P r i n t T e m p A c t i o n P a g e ( H t t p S e r v l e t R e s p o n s e   o R e s ,   S t r i n g   s M s g ,   S t r i n g   s N e x t P a g e )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   M e n u < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > "   +   s M s g   +   "   < / h 3 > " ) ;  
                  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f r e s p o n s e '   a c t i o n = ' . / "   +   s N e x t P a g e   +   " '   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b O k '   v a l u e = ' O k ' > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;  
         }  
      
 }  
