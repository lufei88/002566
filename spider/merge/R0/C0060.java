package com.github.catvod.spider.merge.r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.PrecomputedText;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBwwgg;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.P123;
import com.github.catvod.spider.XBPQc;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0172d;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.q;
import com.github.catvod.spider.merge.P0.z;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.H;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.k;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.h;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.L;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.q0.f;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.e;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: com.github.catvod.spider.merge.r0.۟ۦۧۤۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0060 {

    /* renamed from: ۤۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int f856 = -146;

    /* renamed from: ۟۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m9268(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((M) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m9269(Object obj, Object obj2, Object obj3) {
        if (C0000.m1116() <= 0) {
            ((P123) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m9270(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            ((AbstractC0296g) obj).e((C0295f) obj2);
        }
    }

    /* renamed from: ۟۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static void m9271(Object obj) {
        if (C0008.m1975() >= 0) {
            Market.restartApp((Context) obj);
        }
    }

    /* renamed from: ۟۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m9272() {
        if (C0004.m1557() <= 0) {
            return "playerContent()错误！-->";
        }
        return null;
    }

    /* renamed from: ۟۠ۦۢۤ, reason: not valid java name and contains not printable characters */
    public static long m9273(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((d) obj).g;
        }
        return 0L;
    }

    /* renamed from: ۟۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m9274(long j) {
        if (C0034.m6048() < 0) {
            SystemClock.sleep(j);
        }
    }

    /* renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.O.b m9275(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return com.github.catvod.spider.merge.O.b.b((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static C m9276(Object obj) {
        if (C0036.m6252() >= 0) {
            return C.c((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9277() {
        if (C0009.m2047() > 0) {
            return "filters";
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static C0172d m9278() {
        if (C0042.m7147() < 0) {
            return n.q;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m9279(Object obj, Object obj2, int i, int i2) {
        if (C0044.m7508() < 0) {
            return ((Inflater) obj).inflate((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m9280(Object obj) {
        if (C0023.m4566() <= 0) {
            ((C0232A) obj).b();
        }
    }

    /* renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9281(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            ((PrecomputedText) obj).removeSpan(obj2);
        }
    }

    /* renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9282(Object obj) {
        if (C0035.m6140() < 0) {
            return ((LinearLayout) obj).getOrientation();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m9283(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            ((GradientDrawable) obj).setCornerRadii((float[]) obj2);
        }
    }

    /* renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m9284(Object obj) {
        if (C0015.m3433() > 0) {
            return ((String) obj).toUpperCase();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static String m9285() {
        if (C0005.m1599() < 0) {
            return "+";
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9286(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((AccessibilityNodeInfo) obj).isShowingHintText();
        }
        return false;
    }

    /* renamed from: ۣ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m9287(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m9288(Object obj) {
        if (C0008.m1975() >= 0) {
            return C0246g.w((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m9289(Object obj, char c, char c2) {
        if (C0033.m5872() > 0) {
            return ((String) obj).replace(c, c2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m9290() {
        if (C0034.m6048() <= 0) {
            return "clan://";
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9291() {
        if (C0023.m4566() <= 0) {
            return "dtYear";
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m9292(Object obj) {
        if (C0059.m9257() < 0) {
            return ((h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9293(Object obj, boolean z, boolean z2) {
        if (m9355() > 0) {
            return ((File) obj).setExecutable(z, z2);
        }
        return false;
    }

    /* renamed from: ۟ۥۥۣۦ, reason: not valid java name and contains not printable characters */
    public static double m9294() {
        if (C0010.m2320() < 0) {
            return Math.random();
        }
        return 0.0d;
    }

    /* renamed from: ۟ۥۨۥ۟, reason: not valid java name and contains not printable characters */
    public static void m9295(Object obj) {
        if (C0016.m3596() < 0) {
            ((A) obj).F();
        }
    }

    /* renamed from: ۟ۥۨۥۢ, reason: not valid java name and contains not printable characters */
    public static void m9296(Object obj, int i) {
        if (C0024.m4693() <= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginEnd(i);
        }
    }

    /* renamed from: ۟ۥۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m9297(Object obj, Object obj2, Object obj3, boolean z, Object obj4) {
        if (C0002.m1242() >= 0) {
            return ((Bili) obj).categoryContent((String) obj2, (String) obj3, z, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9298(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((f) obj).nextInt();
        }
        return 0;
    }

    /* renamed from: ۟ۦۤۢ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9299() {
        if (C0007.m1886() > 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.a();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۣۣ, reason: not valid java name and contains not printable characters */
    public static S m9300() {
        if (C0035.m6140() < 0) {
            return L.a;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣ۠, reason: not valid java name and contains not printable characters */
    public static p m9301(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.R.e[] m9302(Object obj) {
        if (C0025.m4797() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9303(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((k) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۨۧ, reason: not valid java name and contains not printable characters */
    public static String m9304(Object obj) {
        if (C0025.m4797() > 0) {
            return ((XBPQc) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۠۠, reason: not valid java name and contains not printable characters */
    public static z m9305() {
        if (C0034.m6048() < 0) {
            return z.c;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m9306(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).v;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9307(Object obj, Object obj2, int i, int i2) {
        if (C0053.m8389() >= 0) {
            return ((Reader) obj).read((char[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Pattern[] m9308() {
        if (C0011.m2755() > 0) {
            return AppYsV2.f;
        }
        return null;
    }

    /* renamed from: ۟ۧۤۧۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m9309(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.e1.a) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static q m9310() {
        if (C0000.m1116() < 0) {
            return q.c;
        }
        return null;
    }

    /* renamed from: ۠ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static g m9311(int i, Object obj) {
        if (C0015.m3433() >= 0) {
            return com.github.catvod.spider.merge.B0.a.c(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m9312(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return HBDmSou.b((Future) obj, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m9313(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.F.f) obj).a();
        }
        return null;
    }

    /* renamed from: ۠ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m9314(Object obj) {
        if (C0053.m8389() > 0) {
            ((C0271a) obj).a();
        }
    }

    /* renamed from: ۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9315(Object obj, boolean z) {
        if (C0051.m8216() <= 0) {
            ((Market) obj).setBusy(z);
        }
    }

    /* renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m9316(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            ((com.github.catvod.spider.merge.N.a) obj).b((com.github.catvod.spider.merge.N.b) obj2);
        }
    }

    /* renamed from: ۡۡۥ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m9317() {
        if (C0045.m7538() < 0) {
            return HBcms10.a();
        }
        return null;
    }

    /* renamed from: ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9318(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m9319(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((com.github.catvod.spider.merge.a0.M) obj).e();
        }
        return null;
    }

    /* renamed from: ۢ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m9320(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((com.github.catvod.spider.merge.a0.M) obj).r;
        }
        return null;
    }

    /* renamed from: ۢۡۥۤ, reason: not valid java name and contains not printable characters */
    public static String m9321(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.d) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m9322() {
        if (C0016.m3596() < 0) {
            return "dtUrlNode";
        }
        return null;
    }

    /* renamed from: ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Paint.Align m9323() {
        if (C0036.m6252() > 0) {
            return Paint.Align.CENTER;
        }
        return null;
    }

    /* renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Locale m9324(Object obj) {
        if (C0032.m5686() <= 0) {
            return com.github.catvod.spider.merge.M0.b.a((Locale) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9325(Object obj, int i, int i2) {
        if (C0061.m9359() < 0) {
            return ((l0) obj).d(i, i2);
        }
        return false;
    }

    /* renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9326(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.f) obj).h;
        }
        return false;
    }

    /* renamed from: ۣۥۡۧ, reason: not valid java name and contains not printable characters */
    public static r m9327(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            return ((r) obj).f((r) obj2);
        }
        return null;
    }

    /* renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m9328(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((WebBackForwardList) obj).getSize();
        }
        return 0;
    }

    /* renamed from: ۣۦۦۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.f m9329(Object obj, int i, int i2, int i3) {
        if (C0062.m9429() >= 0) {
            return ((com.github.catvod.spider.merge.W.h) obj).a(i, i2, i3);
        }
        return null;
    }

    /* renamed from: ۤۢۦۤ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m9330() {
        if (C0005.m1599() < 0) {
            return Executors.newCachedThreadPool();
        }
        return null;
    }

    /* renamed from: ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m9331(int i) {
        if (C0030.m5375() > 0) {
            return Integer.signum(i);
        }
        return 0;
    }

    /* renamed from: ۤۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9332(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0040.m6582() > 0) {
            return ((HBwwgg) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۦۣ۟, reason: not valid java name and contains not printable characters */
    public static WeakReference m9333(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((x) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m9334() {
        if (C0032.m5686() <= 0) {
            return "dtUrlId";
        }
        return null;
    }

    /* renamed from: ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m9335(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.merge.M.e) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static void m9336(Object obj, int i, Object obj2) throws InvalidKeyException {
        if (C0020.m4210() <= 0) {
            ((Cipher) obj).init(i, (Key) obj2);
        }
    }

    /* renamed from: ۤۨۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9337(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.merge.T0.r) obj).l();
        }
        return false;
    }

    /* renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static byte[] m9338(Object obj, Object obj2) {
        if (C0057.m9017() > 0) {
            return ((Mac) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۧ, reason: contains not printable characters */
    public static String m9339(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.a0.M) obj).o;
        }
        return null;
    }

    /* renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static String m9340() {
        if (C0015.m3433() >= 0) {
            return "dtMark";
        }
        return null;
    }

    /* renamed from: ۥۤۥۨ, reason: contains not printable characters */
    public static String m9341() {
        if (C0045.m7538() < 0) {
            return "        </div>";
        }
        return null;
    }

    /* renamed from: ۥۣۧ, reason: contains not printable characters */
    public static FrameLayout m9342(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.W.q) obj).b;
        }
        return null;
    }

    /* renamed from: ۦ۠ۦۥ, reason: contains not printable characters */
    public static void m9343(Object obj) {
        if (C0010.m2320() < 0) {
            s.a((WebView) obj);
        }
    }

    /* renamed from: ۦۡۡۡ, reason: contains not printable characters */
    public static ScheduledFuture m9344(Object obj, Object obj2, long j, long j2, Object obj3) {
        if (C0048.m7971() >= 0) {
            return ((ScheduledExecutorService) obj).scheduleWithFixedDelay((Runnable) obj2, j, j2, (TimeUnit) obj3);
        }
        return null;
    }

    /* renamed from: ۦۢ۠ۢ, reason: contains not printable characters */
    public static String m9345(Object obj) {
        if (C0058.m9131() < 0) {
            return ((com.github.catvod.spider.merge.V.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۤۨ, reason: contains not printable characters */
    public static m m9346(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((C0233B) obj).m((j) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.h m9347() {
        if (C0038.m6471() >= 0) {
            return n.m;
        }
        return null;
    }

    /* renamed from: ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m9348() {
        if (C0027.m5017() > 0) {
            return com.github.catvod.spider.merge.V0.p.f;
        }
        return null;
    }

    /* renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9349(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣۧۡۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9350(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((H) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۡۦۥ, reason: not valid java name and contains not printable characters */
    public static Notification m9351(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((Notification) obj).publicVersion;
        }
        return null;
    }

    /* renamed from: ۨۡۡۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9353(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((com.github.catvod.spider.merge.M.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۨۡۤۢ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m9354(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۨۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m9355() {
        return (-807) ^ C0058.f846;
    }

    /* renamed from: ۨۤۡۡ, reason: not valid java name and contains not printable characters */
    public static String m9356(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((XPath) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۥۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9357(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۧۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m9352(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}