 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s a n d h i ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B S t a n d a r d J o i n R u l e S e t   {  
  
 	 / / p r i v a t e   L i s t < H B W o r d J o i n R u l e >   l i s t R u l e s   =   n e w   A r r a y L i s t < H B W o r d J o i n R u l e > ( ) ;  
 	 / / T O D O   H a v e   m u l t i p l e   r u l e   s e t s  
 	  
 	 L i s t < H B W o r d J o i n R u l e >   l i s t _ N o u n R u l e s   =   n e w   A r r a y L i s t < H B W o r d J o i n R u l e > ( ) ;  
 	 L i s t < H B W o r d J o i n R u l e >   l i s t _ V e r b R u l e s   =   n e w   A r r a y L i s t < H B W o r d J o i n R u l e > ( ) ;  
 	 L i s t < H B W o r d J o i n R u l e >   l i s t _ A l l R u l e s   =   n e w   A r r a y L i s t < H B W o r d J o i n R u l e > ( ) ;  
 	  
 	  
 	 p u b l i c   H B S t a n d a r d J o i n R u l e S e t ( )    
 	 {  
 	 	 H B J o i n R u l e 1   o R 1   =   n e w   H B J o i n R u l e 1 ( ) ;  
 	 	 H B J o i n R u l e 2   o R 2   =   n e w   H B J o i n R u l e 2 ( ) ;  
 	 	 H B J o i n R u l e 3   o R 3   =   n e w   H B J o i n R u l e 3 ( ) ;  
 	 	 H B J o i n R u l e 4   o R 4   =   n e w   H B J o i n R u l e 4 ( ) ;  
 	 	 H B J o i n R u l e 5   o R 5   =   n e w   H B J o i n R u l e 5 ( ) ;  
 	 	 H B J o i n R u l e 6   o R 6   =   n e w   H B J o i n R u l e 6 ( ) ;  
 	 	 H B J o i n R u l e 7   o R 7   =   n e w   H B J o i n R u l e 7 ( ) ;  
 	 	 H B J o i n R u l e 8   o R 8   =   n e w   H B J o i n R u l e 8 ( ) ;  
 	 	 H B J o i n R u l e 9   o R 9   =   n e w   H B J o i n R u l e 9 ( ) ;  
 	 	 H B J o i n R u l e 1 0   o R 1 0   =   n e w   H B J o i n R u l e 1 0 ( ) ; 	 	  
 	 	 H B J o i n R u l e 1 1   o R 1 1   =   n e w   H B J o i n R u l e 1 1 ( ) ;  
 	 	 H B J o i n R u l e 1 2   o R 1 2   =   n e w   H B J o i n R u l e 1 2 ( ) ;  
 	 	  
 	 	  
 	 	 / / 	 1 .  �����  ����  ���  ������  
 	 	 / /   	 x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 2 ] y  
 	 	  
 	 	 / / 	 2 .  ��  ����  ���  ������  
 	 	 / /   x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	  
 	 	 / / 	 3 .  ����  ������  
 	 	 / /   x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	  
 	 	 / / 4 .  ��������  ������  
 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 3 ] y  
 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y  
 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y  
 	 	  
 	 	 / /   5 .  ���� �����  ������  
 	 	 / /   x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 / /   G 3   =   {� ,� ,  � ,  � ,  � ,  � ,  � ,  � }  
 	 	 / /   x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 / /   G 3   =   {� ,� ,  � ,  � ,  � ,  � ,  � ,  � }  
 	 	  
 	 	 / / 6 .  ��������  ������  
 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	  
 	 	 / / 7 .  ��  ���  ������  
 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 2 ] [ G 2   +   S 2 ]   y  
 	 	  
 	 	 / / 8 .  ���� �����  ���  ������  
 	 	 / / x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 3   +   S 3 ] [ G 2   +   S 2 ]   y  
 	 	 / / S 1   =   {� }  
 	 	 / / G 3   =   {� ,  � }  
 	 	  
 	 	 / / 9 .  ���  ������  
 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 3 ] [ G 2   +   S 2 ]   y  
 	 	 / / S 3   =   {� ,  � }  
 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 / / G 3   =   {� ,  � ,  � }  
 	 	  
 	 	 / / 1 0 .  �������  ���  ������  
 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	  
 	 	 / / 1 1 .  �������  ���  ������   2  
 	 	 / / x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 2 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 3 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 4 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 5 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 6 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 7 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 8 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 9 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 0 ) ; 	 	  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 1 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 2 ) ;  
 	 	  
 	 	 / / l i s t _ N o u n R u l e s . a d d ( o R 1 ) ;  
 	 	 / / l i s t _ N o u n R u l e s . a d d ( o R 2 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 3 ) ;  
 	 	 / / l i s t _ N o u n R u l e s . a d d ( o R 4 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 5 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 6 ) ;  
 	 	 / / l i s t _ N o u n R u l e s . a d d ( o R 7 ) ;  
 	 	 / / l i s t _ N o u n R u l e s . a d d ( o R 8 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 9 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 1 0 ) ; 	 	  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 1 1 ) ;  
 	 	 l i s t _ N o u n R u l e s . a d d ( o R 1 2 ) ;  
 	 	  
 / * 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 2 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 3 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 4 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 5 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 6 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 7 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 8 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 9 ) ;  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 0 ) ; 	 	  
 	 	 l i s t _ A l l R u l e s . a d d ( o R 1 1 ) ; 	 * / 	  
 	 	  
 	 }  
 	  
 	 p u b l i c   L i s t < H B W o r d J o i n R u l e >   G e t R u l e S e t ( i n t   i M o d e )  
 	 {  
 	 	 i f ( i M o d e   = =   H B W o r d J o i n e r . J O I N _ M O D E _ N O U N )  
 	 	 {  
 	 	 	 r e t u r n   l i s t _ N o u n R u l e s ;  
 	 	 }  
 	 	 e l s e   i f ( i M o d e   = =   H B W o r d J o i n e r . J O I N _ M O D E _ V E R B )  
 	 	 {  
 	 	 	 r e t u r n   l i s t _ V e r b R u l e s ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   l i s t _ A l l R u l e s ;  
 	 	 }  
 	 } 	  
 	  
 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t ,   i n t   i M o d e )  
 	 { 	 	  
 	 	 L i s t < H B W o r d J o i n R u l e >   l i s t R u l e s   =   G e t R u l e S e t ( i M o d e ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t R u l e s . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	 	 	  
 	 	 	 l i s t R u l e s . g e t ( i ) . J o i n ( o L e f t ,     o R i g h t ,   o R e s u l t s S e t ) ;  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B S t a n d a r d J o i n R u l e S e t : : J o i n   :   [ "   +   o L e f t . G e t B a s e F o r m ( )   +   " ]   +   [ "   +   o R i g h t . G e t B a s e F o r m ( )   +   " ]   :   M e t h o d = "   +   i   +   "   :   R e s u l t s = "   +   o R e s u l t s S e t . G e t R e s u l t s C o u n t ( )   +   " < b r > \ n " ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   i n t   i I n d e x ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t ,   i n t   i M o d e )  
 	 {  
 	 	 L i s t < H B W o r d J o i n R u l e >   l i s t R u l e s   =   G e t R u l e S e t ( i M o d e ) ;  
 	 	  
 	 	 i f ( l i s t R u l e s . s i z e ( )   >   i I n d e x   & &   i I n d e x   > =   0 )  
 	 	 {  
 	 	 	 l i s t R u l e s . g e t ( i I n d e x ) . J o i n ( o L e f t ,     o R i g h t ,   o R e s u l t s S e t ) ;  
 	 	 }  
 	 } 	  
 	  
 	  
 	 p u b l i c   v o i d   D i s j o i n ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,   L i s t < H B W o r d >   l s t O u t ,   i n t   i M o d e )  
 	 {  
 	 	 L i s t < H B W o r d J o i n R u l e >   l i s t R u l e s   =   G e t R u l e S e t ( i M o d e ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t R u l e s . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 i f ( l i s t R u l e s . g e t ( i ) . D i s j o i n L e f t ( o C o m b i n e d ,     o R i g h t ,   l s t O u t ) )  
 	 	 	 {  
 	 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " D i s j o i n   :   "   +   l i s t _ R u l e s . g e t ( i ) . G e t N a m e ( )   +   "   -   "   +   l s t O u t . s i z e ( )   + "   m a t c h e s   \ r " ) ;  
 	 	 	 	  
 	 	 	 	 / / f o r ( i n t   j = 0 ;   j < l s t O u t . s i z e ( ) ;   j + + )  
 	 	 	 	 / / {  
 	 	 	 	 / / 	 S y s t e m . o u t . p r i n t l n ( o C o m b i n e d . G e t N a t u r a l F o r m ( )   +   "   -   "   +   o R i g h t . G e t N a t u r a l F o r m ( )     +   "   =   "   +   l s t O u t . g e t ( j ) . G e t N a t u r a l F o r m ( )   +   " \ r " ) ;  
 	 	 	 	 / / }  
 	 	 	 }  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   D i s j o i n ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,   i n t   i I n d e x ,   L i s t < H B W o r d >   l s t O u t ,   i n t   i M o d e )  
 	 {  
 	 	 L i s t < H B W o r d J o i n R u l e >   l i s t R u l e s   =   G e t R u l e S e t ( i M o d e ) ;  
 	 	  
 	 	 i f ( l i s t R u l e s . s i z e ( )   >   i I n d e x   & &   i I n d e x   > =   0 )  
 	 	 {  
 	 	 	 l i s t R u l e s . g e t ( i I n d e x ) . D i s j o i n L e f t ( o C o m b i n e d ,     o R i g h t ,   l s t O u t ) ;  
 	 	 }  
 	 } 	  
  
 	 p u b l i c   c l a s s   H B J o i n R u l e 1   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 	 1 .  �����  ����  ���  ������  
 	 	 	 / /   	 x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 2 ] y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   0 ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "�����  ����  ���  ������ " ;   }  
  
  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o L e f t   =   o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < H e l a b a s a . a r r _ S w a r a . l e n g t h ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 H B W o r d   o R e t   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 	 o R e t . A p p e n d B a s e C h a r a c t e r ( H e l a b a s a . a r r _ S w a r a [ i ] ) ;  
 	 	 	 	 	 l s t L e f t . a d d ( o R e t ) ;  
 	 	 	 	 }  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 e l s e 	  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 	  
 	 	 / *  
 	 	 p u b l i c   b o o l e a n   D i s j o i n R i g h t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o L e f t ,   L i s t < H B W o r d >   l s t R i g h t )  
 	 	 {  
 	 	 	 i f ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3  
 	 	 	 	 	 | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   > =   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( ! H e l a b a s a . I s S w a r a L e t t e r ( o L e f t . G e t B a s e C h a r a c t e r A t ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) . c h a r A t ( 0 ) ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 	 	 	  
 	 	 	 H B W o r d   o L e f t M o d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   -   1 ) ;  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . S t a r t s W i t h ( o L e f t M o d ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o R i g h t   =   o C o m b i n e d . S u b W o r d ( o L e f t M o d . G e t B a s e C h a r a c t e r C o u n t ( ) ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) ) ; 	 	 	 	  
 	 	 	 	 l s t R i g h t . a d d ( o R i g h t ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 e l s e 	  
 	 	 	 	 r e t u r n   f a l s e ; 	 	  
 	 	 } * /  
 	 }  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 2   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 	 2 .  ��  ����  ���  ������  
 	 	 	 / /   x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   1 ) ;  
 	 	 	 } 	 	  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o Y   =   o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o Y ) )  
 	 	 	 	 {  
 	 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o Y . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 / *  
 	 	 p u b l i c   b o o l e a n   D i s j o i n R i g h t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o L e f t ,   L i s t < H B W o r d >   l s t R i g h t )  
 	 	 {  
 	 	 	 / /   x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	 	  
 	 	 	 / /   V a l i d a t i o n s  
 	 	 	 / /   S t a r t s   w i t h   o L e f t  
 	 	 	 / /   y   n o t   s t a r t   w i t h   a   v o w e l    
 	 	 	 / /   g e n e r a t e   a l l   S 1 + y   c o m b i n a t i o n s  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3   | |   ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   +   1 )   > =   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 } 	 	 	  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . S t a r t s W i t h ( o L e f t ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o Y   =   o C o m b i n e d . S u b W o r d ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	  
 	 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( o Y . G e t B a s e C h a r a c t e r A t ( 0 ) . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < H e l a b a s a . a r r _ S w a r a . l e n g t h ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 H B W o r d   o R e t   =   o Y . C l o n e ( ) ;  
 	 	 	 	 	 o R e t . P r e p e n d B a s e C h a r a c t e r ( H e l a b a s a . a r r _ S w a r a [ i ] ) ; 	 	 	 	 	  
 	 	 	 	 	 l s t R i g h t . a d d ( o R e t ) ;  
 	 	 	 	 }  
 	 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 e l s e 	  
 	 	 	 	 r e t u r n   f a l s e ; 	 	 	 	 	 	 	  
 	 	 } * /  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "��  ����  ���  ������ " ;   } 	 	  
 	 } 	  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 3   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 	 3 .  ����  ������  
 	 	 	 / /   x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ H A L   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   2 ) ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   1   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o Y   =   o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o Y ) )  
 	 	 	 	 {  
 	 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 } 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 / *  
 	 	 p u b l i c   b o o l e a n   D i s j o i n R i g h t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o L e f t ,   L i s t < H B W o r d >   l s t R i g h t )  
 	 	 {  
 	 	 	 / /   x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] y  
 	 	 	  
 	 	 	 i f ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   <   1   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3    
 	 	 	 	 	 | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   +   1   )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 	 	 	  
 	 	 	 H B W o r d   o Y   =     o C o m b i n e d . S u b W o r d ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) + 1 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . S t a r t s W i t h ( o L e f t )   & &   o C o m b i n e d . E n d s W i t h ( o Y ) )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s S 1   =   o C o m b i n e d . G e t B a s e C h a r a c t e r A t ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( s S 1 . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 f o r ( i n t   i = 0 ;   i < H e l a b a s a . a r r _ S w a r a . l e n g t h ;   i + + )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 H B W o r d   o R e t   =   o Y . C l o n e ( ) ;  
 	 	 	 	 	 	 o R e t . P r e p e n d B a s e C h a r a c t e r ( H e l a b a s a . a r r _ S w a r a [ i ] ) ; 	 	 	 	 	  
 	 	 	 	 	 	 l s t R i g h t . a d d ( o R e t ) ;  
 	 	 	 	 	 }  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 e l s e 	  
 	 	 	 	 r e t u r n   f a l s e ; 	 	 	  
 	 	 } * /  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "����  ������ " ;   } 	 	  
 	 }  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 4   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 4 .  ��������  ������  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 3 ] y  
 	 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y  
 	 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y  
 	 	 	 	 	 	  
 	 	 	 i f ( o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) . e q u a l s ( "� " )   & &   o R i g h t . G e t B a s e C h a r a c t e r A t ( 0 ) . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   3 ) ;  
 	 	 	 }  
 	 	 	 i f ( o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) . e q u a l s ( "� " )   & &   o R i g h t . G e t B a s e C h a r a c t e r A t ( 0 ) . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   3 ) ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r A t ( 0 ) . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o E n d   =   n e w   H B W o r d ( "� " ) ;  
 	 	 	 	 o E n d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ) ;  
 	 	 	 	  
 	 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o E n d ) )  
 	 	 	 	 {  
 	 	 	 	 	 H B W o r d   o L e f t   =   o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 o L e f t . A p p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	  
 	 	 	 	 	 l s t L e f t . a d d ( o L e f t ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r A t ( 0 ) . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o E n d   =   n e w   H B W o r d ( "� " ) ;  
 	 	 	 	 o E n d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ) ;  
 	 	 	 	  
 	 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o E n d ) )  
 	 	 	 	 {  
 	 	 	 	 	 H B W o r d   o L e f t   =   o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 o L e f t . A p p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	  
 	 	 	 	 	 l s t L e f t . a d d ( o L e f t ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 / *  
 	 	 p u b l i c   b o o l e a n   D i s j o i n R i g h t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o L e f t ,   L i s t < H B W o r d >   l s t R i g h t )  
 	 	 {  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 3 ] y  
 	 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y  
 	 	 	 / / x [ G 1   +  � ]   +   [� ] y   - >   x [ G 1   +  � ] y 	  
 	 	 	  
 	 	 	 i f ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3  
 	 	 	 	 	 | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   < =   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 S t r i n g   s S 1   =   o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) ;  
 	 	 	 S t r i n g   s S 3   =   o C o m b i n e d . G e t B a s e C h a r a c t e r A t ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	  
 	 	 	 i f ( s S 3 . e q u a l s ( "� " )   & &   s S 1 . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o Y   =   o C o m b i n e d . S u b W o r d ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o Y . P r e p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 l s t R i g h t . a d d ( o Y ) ;  
 	 	 	 	 r e t u r n   t r u e ; 	 	 	 	  
 	 	 	 }  
 	 	 	 i f ( s S 3 . e q u a l s ( "� " )   & &   s S 1 . e q u a l s ( "� " ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o Y   =   o C o m b i n e d . S u b W o r d ( o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o Y . P r e p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 l s t R i g h t . a d d ( o Y ) ;  
 	 	 	 	 r e t u r n   t r u e ; 	 	 	 	  
 	 	 	 }  
 	 	 	 r e t u r n   f a l s e ; 	 	 	  
 	 	 } * /  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "��������  ������ " ;   } 	 	  
 	 }  
  
 	 p u b l i c   c l a s s   H B J o i n R u l e 5   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / /   5 .  ���� �����  ������  
 	 	 	 / /   x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 	 / /   G 3   =   {� ,� ,  � ,  � ,  � ,  � ,  � ,  � }  
 	 	 	  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 H B W o r d   o L a s t P a r t   =   o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ;  
 	 	 	 	 o J o i n e d . A p p e n d ( o L a s t P a r t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   4 ) ; 	  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	 / /   x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 	 / /   G 3   =   {� ,� ,  � ,  � ,  � ,  � ,  � ,  � }  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   4 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 H B W o r d   o S 2 Y   =   o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 S t r i n g   s G 3   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 S t r i n g   s S 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 2 ) ;  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( s S 2 . c h a r A t ( 0 ) )   & &   ( s G 3 . e q u a l s ( "�� " )   | |   s G 3 . e q u a l s ( "�� " )   | |     s G 3 . e q u a l s ( "�� " )   | |   s G 3 . e q u a l s ( "�� " )   | |   s G 3 . e q u a l s ( "�� " )   | |   s G 3 . e q u a l s ( "�� " )  
 	 	 	 	 	 | |   s G 3 . e q u a l s ( "�� " )   | |     s G 3 . e q u a l s ( "�� " ) )   & &   o C o m b i n e d . E n d s W i t h ( o S 2 Y ) )  
 	 	 	 {  
 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,     o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "���� �����  ������ " ;   } 	 	  
 	 } 	  
  
 	 p u b l i c   c l a s s   H B J o i n R u l e 6   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 6 .  ��������  ������  
 	 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ H A L   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) ) ; 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   5 ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   4 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 	 	 	  
 	 	 	 S t r i n g   s G 1 1   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 S t r i n g   s G 1 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 S t r i n g   s S 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 2 ) ;  
 	 	 	  
 	 	 	 H B W o r d   o S 2 Y   =   o R i g h t . S u b W o r d ( 1 ,   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( s S 2 . c h a r A t ( 0 ) )   & &   ( s G 1 1 . e q u a l s ( s G 1 2 ) )   & &   o C o m b i n e d . E n d s W i t h ( o S 2 Y ) )  
 	 	 	 {  
 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,     o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "�����  ���  ������ " ;   } 	 	  
 	 }  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 7   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 7 .  ��  ���  ������  
 	 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 2 ] [ G 2   +   S 2 ]   y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ H A L   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( o R i g h t . G e t B a s e C h a r a c t e r A t ( 0 ) ) ; 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   6 ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   4 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 	 	 	  
 	 	 	 S t r i n g   s G 2 1   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 S t r i n g   s G 2 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 S t r i n g   s S 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 2 ) ;  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t )   & &   H e l a b a s a . I s S w a r a L e t t e r ( s S 2 . c h a r A t ( 0 ) )   & &   ( s G 2 1 . e q u a l s ( s G 2 2 )   ) )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o L e f t   =   o C o m b i n e d . S u b W o r d ( 0 ,     o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( ) - o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o L e f t . A p p e n d B a s e C h a r a c t e r ( H B W o r d . H B W _ C H A R _ G A T H R A K S H A R A ) ;  
 	 	 	 	 l s t L e f t . a d d ( o L e f t ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "��  ���  ������ " ;   } 	 	  
 	 } 	  
  
 	 p u b l i c   c l a s s   H B J o i n R u l e 8   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 8 .  ���� �����  ���  ������  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 3   +   S 3 ] [ G 2   +   S 2 ]   y  
 	 	 	 / / S 1   =   {� }  
 	 	 	 / / G 3   =   {� ,  � }  
 	 	 	 / / T O D O  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	 / /   T O D O    
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "���� �����  ���  ������ " ;   } 	 	  
 	 } 	  
 	  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 9   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 9 .  ���  ������  
 	 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 3 ] [ G 2   +   S 2 ]   y  
 	 	 	 / / S 3   =   {� ,  � }  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ H A L   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   8 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   8 ) ;  
 	 	 	 }  
 	 	 	  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 	 / / G 3   =   {� ,  � ,  � }  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   8 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   8 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   8 ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   5 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 / / 9 .  ���  ������  
 	 	 	 / / x [ G 1 ]   +   [ G 2   +   S 2 ] y   - >   x [ G 1   +   S 3 ] [ G 2   +   S 2 ]   y  
 	 	 	 / / S 3   =   {� ,  � }  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t )   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s S 3   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 i f ( s S 3 . e q u a l s ( "� " )   | |   s S 3 . e q u a l s ( "� " ) )  
 	 	 	 	 {  
 	 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   -   1 ) ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1   +   S 1 ] [ G 3   +   S 2 ]   y  
 	 	 	 / / G 3   =   {� ,  � ,  � } 	 	 	  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t )   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s G 3   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 	 i f ( s G 3 . e q u a l s ( "�� " )   | |   s G 3 . e q u a l s ( "�� " )     | |   s G 3 . e q u a l s ( "�� " ) )  
 	 	 	 	 {  
 	 	 	 	 	 l s t L e f t . a d d ( o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   -   1 ) ) ;  
 	 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 } 	 	 	  
 	 	 	 } 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "���  ������ " ;   } 	 	  
 	 }  
 	  
  
 	 p u b l i c   c l a s s   H B J o i n R u l e 1 0   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 1 0 .  �������  ���  ������  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 1 ) ) ; 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   9 ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   4 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	 / / x [ G 1   +   S 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y 	 	 	  
 	 	 	 S t r i n g   s G 1 1   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) + 1 ) ;  
 	 	 	 S t r i n g   s G 1 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t )   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A   & &   s G 1 1 . e q u a l s ( s G 1 2 )     & &   H e l a b a s a . I s H a l L e t t e r ( s G 1 1 . c h a r A t ( 0 ) ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 H B W o r d   o X G 1   =   o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   -   1 ) ;  
 	 	 	 	 o X G 1 . A p p e n d B a s e C h a r a c t e r ( H B W o r d . H B W _ C H A R _ S W A R A ) ;  
 	 	 	 	 l s t L e f t . a d d ( o X G 1 ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 	 	 	  
 	 	 	 } 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "�������  ���  ������ " ;   } 	 	  
 	 } 	  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 1 1   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 1 1 .  �������  ���  ������   2  
 	 	 	 / / x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ H A L   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d   =   o L e f t . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) ) ; 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   1 0 ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 i f ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   <   2   | |   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   <   3 )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 	  
 	 	 	 S t r i n g   s G 1 1   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) + 1 ) ;  
 	 	 	 S t r i n g   s G 1 2   =   o C o m b i n e d . G e t B a s e C h a r a c t e r F r o m E n d ( o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 	 / / x [ G 1 ]   +   [ S 2 ] y   - >   x [ G 1 ] [ G 1   +   S 2 ]   y  
 	 	 	 i f ( o C o m b i n e d . E n d s W i t h ( o R i g h t )   & &   o R i g h t . G e t F i r s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ S W A R A   & &   s G 1 1 . e q u a l s ( s G 1 2 )   & &   H e l a b a s a . I s H a l L e t t e r ( s G 1 1 . c h a r A t ( 0 ) ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 H B W o r d   o X G 1   =   o C o m b i n e d . S u b W o r d ( 0 ,   o C o m b i n e d . G e t B a s e C h a r a c t e r C o u n t ( )   -   o R i g h t . G e t B a s e C h a r a c t e r C o u n t ( )   -   1 ) ; 	 	 	 	  
 	 	 	 	 l s t L e f t . a d d ( o X G 1 ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 	 	 	 	  
 	 	 	 } 	  
 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "�������  ���  ������   2 " ;   } 	 	  
 	 } 	 	  
 	  
 	 p u b l i c   c l a s s   H B J o i n R u l e 1 2   i m p l e m e n t s   H B W o r d J o i n R u l e  
 	 { 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   v o i d   J o i n ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s S e t )    
 	 	 {  
 	 	 	 / / 	 1 .  ����  ������  
 	 	 	 / /   	 x [ G 1   +  � ]   +   [ S 2 ] y   - >   x [ G 1   +  � ] [ G   + � S 2 ] y  
 	 	 	 i f ( o L e f t . G e t L a s t C h a r a c t e r T y p e ( ) = = H B W o r d . H B W _ C O M B I N E D   & &   o L e f t . G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) = = "� " )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o J o i n e d 1   =   o L e f t . S u b W o r d ( 0 ,   o L e f t . G e t B a s e C h a r a c t e r C o u n t ( ) - 1 ) ;  
 	 	 	 	 o J o i n e d 1 . A p p e n d B a s e C h a r a c t e r ( "� " ) ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 H B W o r d   o J o i n e d   =   o J o i n e d 1 . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   1 1 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o J o i n e d 1 . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   1 1 ) ;  
 	 	 	 	  
 	 	 	 	 o J o i n e d   =   o J o i n e d 1 . C l o n e ( ) ;  
 	 	 	 	 o J o i n e d . A p p e n d B a s e C h a r a c t e r ( "�� " ) ; 	 	 	 	 	 	 	 	  
 	 	 	 	 o J o i n e d . A p p e n d ( o R i g h t ) ;  
 	 	 	 	 o R e s u l t s S e t . A d d ( o L e f t ,   o R i g h t ,   o J o i n e d ,   1 1 ) ;  
 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   b o o l e a n   D i s j o i n L e f t ( H B W o r d   o C o m b i n e d ,   H B W o r d   o R i g h t ,  
 	 	 	 	 L i s t < H B W o r d >   l s t L e f t )   {  
 	 	 	  
 	 	 	 / / T O D O  
 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 @ O v e r r i d e  
 	 	 p u b l i c   S t r i n g   G e t N a m e ( )   {   r e t u r n   "����  ������ " ;   } 	 	  
 	 } 	 	  
 	  
 }  
