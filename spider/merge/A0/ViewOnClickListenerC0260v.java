package com.github.catvod.spider.merge.a0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h0.C0332l;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0325e;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

/* renamed from: com.github.catvod.spider.merge.a0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0260v implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f731short = {1723, 1716, 1726, 1704, 1717, 1715, 1726, 1780, 1715, 1716, 1710, 1727, 1716, 1710, 1780, 1723, 1721, 1710, 1715, 1717, 1716, 1780, 1676, 1683, 1695, 1677, 3022, 3010, 3008, 2947, 3064, 3054, 3040, 3010, 3023, 3012, 3009, 3016, 27882, 20553, -31995, 2965, 2947, 2945, 2992, 2992, -32713, 17599, 32488, 27051, 29633, 32187, -25210, 693, 698, 688, 678, 699, 701, 688, 762, 701, 698, 672, 689, 698, 672, 762, 693, 695, 672, 701, 699, 698, 762, 642, 669, 657, 643, 857, 853, 855, 788, 879, 889, 887, 853, 856, 851, 854, 863, 25444, 24519, -29557, 1051, 1037, 1039, 1086, 1086, -28743, 19249, 29030, 26149, 31823, 29237, -28152, 887, 888, 882, 868, 889, 895, 882, 824, 895, 888, 866, 883, 888, 866, 824, 887, 885, 866, 895, 889, 888, 824, 832, 863, 851, 833, 791, 795, 793, 858, 773, 769, 789, 774, 799, 858, 791, 792, 795, 769, 784, 784, 774, 797, 770, 785, 1905, 1917, 1919, 1852, 1891, 1895, 1907, 1888, 1913, 1852, 1904, 1888, 1917, 1893, 1889, 1911, 1888, 25860, 22951, -29973, 23318, 21349, 32127, 29942, 623, 606, 606, -30247, 19793, 30470, 24645, 31279, 29781, -27544};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC0260v(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* renamed from: ۟۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Result m7098(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((QRCodeReader) obj).decode((BinaryBitmap) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7099() {
        if (C0021.m4379() >= 0) {
            return f731short;
        }
        return null;
    }

    /* renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m7100(Object obj) {
        if (C0007.m1886() > 0) {
            return ((Result) obj).getText();
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM1840;
        switch (C0055.m8785(this)) {
            case 0:
                String str = (String) C0007.m1891(this);
                C0047.m7777((C0233B) C0035.m6090(this));
                String strM1189 = C0001.m1189(m7099(), 106, 26, 790);
                try {
                    Intent intent = new Intent(strM1189, C0022.m4422(str));
                    C0035.m6106(intent, 268435456);
                    C0006.m1781(intent, C0050.m8131(m7099(), 132, 20, 884));
                    C0032.m5680(C0031.m5652(), intent);
                } catch (Exception unused) {
                }
                try {
                    Intent intent2 = new Intent(strM1189, C0022.m4422(str));
                    C0035.m6106(intent2, 268435456);
                    C0006.m1781(intent2, C0002.m1305(m7099(), 152, 17, 1810));
                    C0032.m5680(C0031.m5652(), intent2);
                    break;
                } catch (Exception unused2) {
                    C0038.m6402(C0065.m9775(m7099(), 169, 17, 558));
                    return;
                }
            case 1:
                C0047.m7777((C0246g) C0035.m6090(this));
                Bitmap bitmap = (Bitmap) C0007.m1891(this);
                int iM6744 = C0041.m6744(bitmap);
                int iM4472 = C0022.m4472(bitmap);
                int[] iArr = new int[iM6744 * iM4472];
                C0039.m6521(bitmap, iArr, 0, iM6744, 0, 0, iM6744, iM4472);
                try {
                    strM1840 = m7100(m7098(new QRCodeReader(), new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(iM6744, iM4472, iArr)))));
                } catch (ChecksumException | FormatException | NotFoundException unused3) {
                    strM1840 = C0007.m1840();
                }
                try {
                    Intent intent3 = new Intent(C0018.m3917(m7099(), 53, 26, 724), C0022.m4422(strM1840));
                    C0035.m6106(intent3, 268435456);
                    C0006.m1781(intent3, C0046.m7718(m7099(), 79, 12, 826));
                    C0032.m5680(C0031.m5652(), intent3);
                    break;
                } catch (Exception unused4) {
                    C0038.m6402(C0042.m7151(m7099(), 91, 15, 1102));
                    return;
                }
            case 2:
                String str2 = (String) C0007.m1891(this);
                C0047.m7777((M) C0035.m6090(this));
                try {
                    Intent intent4 = new Intent(C0007.m1842(m7099(), 0, 26, 1754), C0022.m4422(str2));
                    C0035.m6106(intent4, 268435456);
                    C0006.m1781(intent4, C0055.m8814(m7099(), 26, 12, 2989));
                    C0032.m5680(C0031.m5652(), intent4);
                    break;
                } catch (Exception unused5) {
                    C0038.m6402(C0002.m1305(m7099(), 38, 15, 3008));
                    return;
                }
            default:
                C0335o c0335o = (C0335o) C0035.m6090(this);
                C0047.m7777(c0335o);
                C0025.m4829(new RunnableC0325e(c0335o, C0035.m6079((C0332l) C0007.m1891(this)), 0));
                break;
        }
    }
}