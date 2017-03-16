/* Generated By:JavaCC: Do not edit this line. RubyParser14TokenManager.java */
import java.io.StringReader;
import java.io.InputStream;
import java.io.Reader;

/** Token Manager. */
public class RubyParser14TokenManager implements RubyParser14Constants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 2;
            jjmatchedPos = 0;
            return -1;
         }
         if ((active0 & 0x24c00000800000L) != 0L)
            return 4;
         if ((active0 & 0x2L) != 0L || (active1 & 0xfe1fffffffe0L) != 0L)
         {
            jjmatchedKind = 102;
            jjmatchedPos = 0;
            return -1;
         }
         if ((active0 & 0x700000000000000L) != 0L)
            return 9;
         return -1;
      case 1:
         if ((active0 & 0x2L) != 0L || (active1 & 0x1fffffffe0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x2L) != 0L || (active1 & 0x1bff3fffc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x2L) != 0L || (active1 & 0x8f73dafc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x2L) != 0L || (active1 & 0x8e71da700L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active1 & 0x824088300L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active1 & 0x8200L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 102;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 2);
      case 32:
         {
         jjmatchedKind = 3;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 33:
         {
         jjmatchedKind = 40;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0xc0000000000L, 0x0L);
      case 34:
         return jjStopAtPos(0, 7);
      case 36:
         return jjStopAtPos(0, 30);
      case 37:
         {
         jjmatchedKind = 64;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x10000L, 0x0L);
      case 38:
         {
         jjmatchedKind = 65;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x180000L, 0x4L);
      case 39:
         return jjStopAtPos(0, 8);
      case 40:
         return jjStopAtPos(0, 37);
      case 41:
         return jjStopAtPos(0, 38);
      case 42:
         {
         jjmatchedKind = 61;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x4000000000024000L, 0x0L);
      case 43:
         {
         jjmatchedKind = 59;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x80002000L, 0x0L);
      case 44:
         return jjStopAtPos(0, 39);
      case 45:
         {
         jjmatchedKind = 60;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x100040000L, 0x0L);
      case 46:
         {
         jjmatchedKind = 56;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x600000000000000L, 0x0L);
      case 47:
         {
         jjmatchedKind = 63;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 58:
         {
         jjmatchedKind = 10;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10L);
      case 60:
         {
         jjmatchedKind = 46;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x24800000800000L, 0x0L);
      case 61:
         {
         jjmatchedKind = 11;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x40100006000000L, 0x0L);
      case 62:
         {
         jjmatchedKind = 48;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0xa000000000000L, 0x0L);
      case 63:
         return jjStopAtPos(0, 41);
      case 64:
         return jjStopAtPos(0, 29);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20000L);
      case 81:
         return jjStopAtPos(0, 102);
      case 91:
         {
         jjmatchedKind = 33;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0xc00000000L, 0x0L);
      case 93:
         return jjStopAtPos(0, 36);
      case 94:
         {
         jjmatchedKind = 55;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L);
      case 95:
         return jjStopAtPos(0, 12);
      case 96:
         return jjStopAtPos(0, 9);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200100000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000220L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1204100L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000L);
      case 105:
         {
         jjmatchedKind = 102;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x0L, 0xc00000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1100008000L);
      case 111:
         {
         jjmatchedKind = 102;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400000000L);
      case 112:
         return jjStopAtPos(0, 102);
      case 113:
         return jjStopAtPos(0, 102);
      case 114:
         {
         jjmatchedKind = 102;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800080000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2L, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x60040000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x12000000L);
      case 120:
         return jjStopAtPos(0, 102);
      case 121:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80000000L);
      case 123:
         return jjStopAtPos(0, 27);
      case 124:
         {
         jjmatchedKind = 6;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x600000L, 0x8L);
      case 125:
         return jjStopAtPos(0, 28);
      case 126:
         return jjStopAtPos(0, 45);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x4L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L, active1, 0L);
      case 42:
         if ((active0 & 0x4000000000000000L) != 0L)
         {
            jjmatchedKind = 62;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L, active1, 0L);
      case 46:
         if ((active0 & 0x200000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000000L, active1, 0L);
      case 58:
         if ((active1 & 0x10L) != 0L)
            return jjStopAtPos(1, 68);
         break;
      case 60:
         if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L, active1, 0L);
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         else if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         return jjMoveStringLiteralDfa2_0(active0, 0x20000004000000L, active1, 0L);
      case 62:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L, active1, 0L);
      case 64:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x10000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x20000L);
      case 93:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x808080640L);
      case 102:
         if ((active1 & 0x400000L) != 0L)
            return jjStopAtPos(1, 86);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x12000080L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x180000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x1302000L);
      case 110:
         if ((active1 & 0x800000L) != 0L)
            return jjStopAtPos(1, 87);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x260044100L);
      case 111:
         if ((active1 & 0x20L) != 0L)
            return jjStopAtPos(1, 69);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x1004001000L);
      case 114:
         if ((active1 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 98);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L, active1, 0x8000L);
      case 124:
         if ((active1 & 0x8L) != 0L)
         {
            jjmatchedKind = 67;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L, active1, 0L);
      case 126:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 46:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(2, 58);
         break;
      case 61:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(2, 17);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(2, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(2, 22);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(2, 23);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(2, 26);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(2, 35);
         break;
      case 62:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(2, 53);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000000L, active1, 0L);
      case 68:
         if ((active1 & 0x20000L) != 0L)
            return jjStopAtPos(2, 81);
         break;
      case 71:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x10000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x2000L);
      case 100:
         if ((active1 & 0x4000L) != 0L)
            return jjStopAtPos(2, 78);
         else if ((active1 & 0x200000000L) != 0L)
            return jjStopAtPos(2, 97);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x4040000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x90000080L);
      case 102:
         if ((active1 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 91;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x200L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x2100000L);
      case 108:
         if ((active1 & 0x100000000L) != 0L)
            return jjStopAtPos(2, 96);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x20000040L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x8000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L, active1, 0L);
      case 114:
         if ((active1 & 0x1000L) != 0L)
            return jjStopAtPos(2, 76);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1280900L);
      case 116:
         if ((active1 & 0x1000000000L) != 0L)
            return jjStopAtPos(2, 100);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x840000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(3, 52);
         break;
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x10000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x100000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x80000L);
      case 101:
         if ((active1 & 0x800L) != 0L)
            return jjStopAtPos(3, 75);
         else if ((active1 & 0x200000L) != 0L)
            return jjStopAtPos(3, 85);
         return jjMoveStringLiteralDfa4_0(active0, 0x2L, active1, 0x20048000L);
      case 102:
         if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(3, 70);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x41000600L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x82000000L);
      case 110:
         if ((active1 & 0x80L) != 0L)
            return jjStopAtPos(3, 71);
         else if ((active1 & 0x10000000L) != 0L)
            return jjStopAtPos(3, 92);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x804000100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1);
      return 4;
   }
   switch(curChar)
   {
      case 78:
         if ((active1 & 0x10000L) != 0L)
            return jjStopAtPos(4, 80);
         break;
      case 100:
         if ((active1 & 0x80000000L) != 0L)
            return jjStopAtPos(4, 95);
         break;
      case 101:
         if ((active1 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 89);
         break;
      case 102:
         if ((active1 & 0x40000L) != 0L)
            return jjStopAtPos(4, 82);
         else if ((active1 & 0x1000000L) != 0L)
            return jjStopAtPos(4, 88);
         break;
      case 108:
         if ((active1 & 0x40000000L) != 0L)
            return jjStopAtPos(4, 94);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x4000000L);
      case 110:
         if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(4, 74);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x200L);
      case 114:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(4, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x800008100L);
      case 115:
         if ((active1 & 0x2000L) != 0L)
            return jjStopAtPos(4, 77);
         else if ((active1 & 0x100000L) != 0L)
            return jjStopAtPos(4, 84);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x20000000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(3, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, 0L, active1);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active1 & 0x100L) != 0L)
            return jjStopAtPos(5, 72);
         else if ((active1 & 0x80000L) != 0L)
            return jjStopAtPos(5, 83);
         else if ((active1 & 0x4000000L) != 0L)
            return jjStopAtPos(5, 90);
         return jjMoveStringLiteralDfa6_0(active1, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active1, 0x8000L);
      case 110:
         if ((active1 & 0x800000000L) != 0L)
            return jjStopAtPos(5, 99);
         break;
      case 115:
         if ((active1 & 0x20000000L) != 0L)
            return jjStopAtPos(5, 93);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, 0L, active1);
}
static private int jjMoveStringLiteralDfa6_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(4, 0L, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, 0L, active1);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         if ((active1 & 0x8000L) != 0L)
            return jjStopAtPos(6, 79);
         break;
      case 100:
         return jjMoveStringLiteralDfa7_0(active1, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(5, 0L, active1);
}
static private int jjMoveStringLiteralDfa7_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(5, 0L, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, 0L, active1);
      return 7;
   }
   switch(curChar)
   {
      case 63:
         if ((active1 & 0x200L) != 0L)
            return jjStopAtPos(7, 73);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, 0L, active1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 20;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfc00ff7b00000000L & l) != 0L)
                  {
                     if (kind > 104)
                        kind = 104;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 103)
                        kind = 103;
                     jjCheckNAddStates(0, 4);
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 114)
                        kind = 114;
                  }
                  if ((0x800000000000400L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  else if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 46)
                     jjCheckNAdd(9);
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 1:
                  if (curChar == 62 && kind > 2)
                     kind = 2;
                  break;
               case 5:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if ((0xfc00ff7b00000000L & l) != 0L && kind > 104)
                     kind = 104;
                  break;
               case 8:
                  if (curChar == 46)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 112)
                     kind = 112;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if ((0x2400L & l) != 0L && kind > 114)
                     kind = 114;
                  break;
               case 11:
                  if (curChar == 10 && kind > 114)
                     kind = 114;
                  break;
               case 12:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 103)
                     kind = 103;
                  jjCheckNAddStates(0, 4);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 112)
                     kind = 112;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if (curChar == 46)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 112)
                     kind = 112;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar == 46 && kind > 112)
                     kind = 112;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 102)
                        kind = 102;
                  }
                  else if ((0x78000001f8000001L & l) != 0L)
                  {
                     if (kind > 104)
                        kind = 104;
                  }
                  break;
               case 2:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 102)
                     kind = 102;
                  break;
               case 7:
                  if ((0x78000001f8000001L & l) != 0L)
                     kind = 104;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   14, 15, 16, 18, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\163\165\160\145\162", null, null, null, null, "\174", "\42", "\47", 
"\140", "\72", "\75", "\137", "\53\75", "\52\75", "\57\75", "\45\75", "\52\52\75", 
"\55\75", "\46\75", "\46\46\75", "\174\75", "\174\174\75", "\74\74\75", "\136\75", 
"\75\75", "\75\75\75", "\173", "\175", "\100", "\44", "\53\100", "\55\100", "\133", 
"\133\135", "\133\135\75", "\135", "\50", "\51", "\54", "\41", "\77", "\41\75", "\41\176", 
"\75\176", "\176", "\74", "\74\74", "\76", "\76\76", "\74\75", "\76\75", "\40\76\76\75", 
"\74\75\76", "\75\76", "\136", "\56", "\56\56", "\56\56\56", "\53", "\55", "\52", "\52\52", 
"\57", "\45", "\46", "\46\46", "\174\174", "\72\72", "\144\157", "\163\145\154\146", 
"\164\150\145\156", "\145\156\163\165\162\145", "\144\145\146\151\156\145\144\77", 
"\142\145\147\151\156", "\143\141\163\145", "\146\157\162", "\143\154\141\163\163", "\145\156\144", 
"\156\165\155\145\162\151\143", "\102\105\107\111\116", "\105\116\104", "\165\156\144\145\146", 
"\162\145\163\143\165\145", "\141\154\151\141\163", "\145\154\163\145", "\151\146", "\151\156", 
"\145\154\163\151\146", "\167\150\151\154\145", "\155\157\144\165\154\145", "\144\145\146", 
"\167\150\145\156", "\165\156\154\145\163\163", "\165\156\164\151\154", "\171\151\145\154\144", 
"\156\151\154", "\141\156\144", "\157\162", "\162\145\164\165\162\156", "\156\157\164", null, 
null, null, null, "\121", "\161", "\170", "\162", "\151", "\157", "\160", null, null, 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffc7L, 0x5ffffffffffffL, 
};
static final long[] jjtoSkip = {
   0x38L, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[20];
static private final int[] jjstateSet = new int[40];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public RubyParser14TokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public RubyParser14TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 20; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 9 && (0x200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 101;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 1 :
         break;
      case 2 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 28 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      case 39 :
         break;
      case 40 :
         break;
      case 41 :
         break;
      case 42 :
         break;
      case 43 :
         break;
      case 44 :
         break;
      case 45 :
         break;
      case 46 :
         break;
      case 47 :
         break;
      case 48 :
         break;
      case 49 :
         break;
      case 50 :
         break;
      case 51 :
         break;
      case 52 :
         break;
      case 53 :
         break;
      case 54 :
         break;
      case 55 :
         break;
      case 56 :
         break;
      case 57 :
         break;
      case 58 :
         break;
      case 59 :
         break;
      case 60 :
         break;
      case 61 :
         break;
      case 62 :
         break;
      case 63 :
         break;
      case 64 :
         break;
      case 65 :
         break;
      case 66 :
         break;
      case 67 :
         break;
      case 68 :
         break;
      case 69 :
         break;
      case 70 :
         break;
      case 71 :
         break;
      case 72 :
         break;
      case 73 :
         break;
      case 74 :
         break;
      case 75 :
         break;
      case 76 :
         break;
      case 77 :
         break;
      case 78 :
         break;
      case 79 :
         break;
      case 80 :
         break;
      case 81 :
         break;
      case 82 :
         break;
      case 83 :
         break;
      case 84 :
         break;
      case 85 :
         break;
      case 86 :
         break;
      case 87 :
         break;
      case 88 :
         break;
      case 89 :
         break;
      case 90 :
         break;
      case 91 :
         break;
      case 92 :
         break;
      case 93 :
         break;
      case 94 :
         break;
      case 95 :
         break;
      case 96 :
         break;
      case 97 :
         break;
      case 98 :
         break;
      case 99 :
         break;
      case 100 :
         break;
      case 101 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 102 :
         break;
      case 103 :
         break;
      case 104 :
         break;
      case 105 :
         break;
      case 106 :
         break;
      case 107 :
         break;
      case 108 :
         break;
      case 109 :
         break;
      case 110 :
         break;
      case 111 :
         break;
      case 112 :
         break;
      case 114 :
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
