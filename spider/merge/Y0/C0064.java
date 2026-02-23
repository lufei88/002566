package com.github.catvod.spider.merge.y0;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.PrecomputedText;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBcms10Dou;
import com.github.catvod.spider.HBrenren;
import com.github.catvod.spider.HBrren;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.HByingSo;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.W55Movie;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.Zhaozy;
import com.github.catvod.spider.merge-xbpq.P.I;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.U;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.P0.o;
import com.github.catvod.spider.merge.P0.y;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.l;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0219x;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.X0.i;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0329i;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.P.r;
import com.github.catvod.spider.p000mergexbpq.P.x;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.g0.D;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.y0.ۣۧۡ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0064 {

    /* renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int f874 = -121;

    /* renamed from: ۟۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m9598(Object obj) {
        if (C0051.m8216() < 0) {
            return ((P) obj).b();
        }
        return null;
    }

    /* renamed from: ۟۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static I m9600() {
        if (C0042.m7147() < 0) {
            return D.o;
        }
        return null;
    }

    /* renamed from: ۟۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m9601(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.e) obj).f();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static void m9602(Object obj, int i) {
        if (C0016.m3596() <= 0) {
            ((com.github.catvod.spider.merge.G.c) obj).o(i);
        }
    }

    /* renamed from: ۟۠۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m9603(Object obj, boolean z) {
        if (C0012.m3024() >= 0) {
            ((WebSettings) obj).setLoadWithOverviewMode(z);
        }
    }

    /* renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m9604() {
        if (C0052.m8320() >= 0) {
            return HBv1Class.generateRandomString();
        }
        return null;
    }

    /* renamed from: ۟۠ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9605(int i) {
        if (C0030.m5375() > 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.d(i);
        }
        return false;
    }

    /* renamed from: ۟۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m9606(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            ((Paint) obj).setStyle((Paint.Style) obj2);
        }
    }

    /* renamed from: ۟۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9607(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0036.m6252() >= 0) {
            ((SpannableString) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* renamed from: ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.T.b m9608(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return ((x) obj).h((com.github.catvod.spider.p000mergexbpq.T.b) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m9609(Object obj) {
        if (C0019.m4065() <= 0) {
            return TextUtils.getLayoutDirectionFromLocale((Locale) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static C0219x m9610() {
        if (C0049.m8038() <= 0) {
            return B.g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9611(char c) {
        if (C0039.m6529() <= 0) {
            return Character.isDigit(c);
        }
        return false;
    }

    /* renamed from: ۟ۡۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9612(Object obj, Object obj2) {
        if (C0039.m6529() < 0) {
            return ((Config) obj).action((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static m m9613(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((Quark) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m9614() {
        if (C0037.m6350() <= 0) {
            return W55Movie.b;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m9615(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.B.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m9616(int i) {
        if (C0030.m5375() > 0) {
            return Color.green(i);
        }
        return 0;
    }

    /* renamed from: ۟ۢۢۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9617(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0277g) obj).d;
        }
        return false;
    }

    /* renamed from: ۟ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static v m9618() {
        if (C0056.m8886() < 0) {
            return A.m;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m9619(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m9620(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((Thread) obj).getId();
        }
        return 0L;
    }

    /* renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.R.a m9621(Object obj) {
        if (C0040.m6582() > 0) {
            return ((XPath) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static v m9622() {
        if (C0062.m9429() >= 0) {
            return C0230a.r;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m9623(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            return ((AppZzun) obj).d((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m9624() {
        if (C0021.m4379() > 0) {
            return " ";
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9625() {
        if (C0032.m5686() <= 0) {
            return "L";
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static float m9626(Object obj) {
        if (C0024.m4693() < 0) {
            return ((TextView) obj).getLineSpacingMultiplier();
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m9627(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.K0.a) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float[] m9628(Object obj) {
        if (m9659() <= 0) {
            return ((com.github.catvod.spider.merge.A.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static PrecomputedText m9629(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return PrecomputedText.create((CharSequence) obj, (PrecomputedText.Params) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m9630(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((i) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9631(Object obj, int i) {
        if (C0061.m9359() <= 0) {
            ((Paint) obj).setColor(i);
        }
    }

    /* renamed from: ۟ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9632(Object obj) {
        if (C0033.m5872() >= 0) {
            p.i((p) obj);
        }
    }

    /* renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static y m9633() {
        if (C0059.m9257() < 0) {
            return y.c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9634(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.W.y) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۤۨۢ, reason: not valid java name and contains not printable characters */
    public static File m9635() {
        if (C0040.m6582() > 0) {
            return s.g;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9636(Object obj) {
        if (C0058.m9131() < 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۥۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9637(Object obj, Object obj2) {
        if (C0025.m4797() >= 0) {
            return Xb6v.b((String) obj, (Pattern) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۥۨۦ, reason: not valid java name and contains not printable characters */
    public static WeakReference m9638(Object obj) {
        if (C0000.m1116() < 0) {
            return ((t) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۥۦ, reason: not valid java name and contains not printable characters */
    public static String m9639() {
        if (C0034.m6048() < 0) {
            return "User-Agent$";
        }
        return null;
    }

    /* renamed from: ۟ۥۧۧۢ, reason: not valid java name and contains not printable characters */
    public static String m9640(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9641(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((StringBuffer) obj).length();
        }
        return 0;
    }

    /* renamed from: ۟ۦ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static char m9642(Object obj) {
        if (C0021.m4379() > 0) {
            return ((o) obj).a;
        }
        return (char) 0;
    }

    /* renamed from: ۟ۦۤۧۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m9643(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((h) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۢۡ, reason: not valid java name and contains not printable characters */
    public static FrameLayout m9644(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((C) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9645(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            return ((C0174a) obj).p((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۣۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9646(Object obj) {
        if (C0029.m5282() >= 0) {
            ((com.github.catvod.spider.merge.E.g) obj).e();
        }
    }

    /* renamed from: ۟ۧۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m9647(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.merge.X0.t) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static Pattern m9648(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Zhaozy) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9649(String str) {
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

    /* renamed from: ۠ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m9650(Object obj, Object obj2) {
        if (C0041.m6823() < 0) {
            ((com.github.catvod.spider.merge.Q.a) obj).g((String) obj2);
        }
    }

    /* renamed from: ۣۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static HB360 m9651(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((HBDmSou) obj).h;
        }
        return null;
    }

    /* renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9652(Object obj) {
        if (C0051.m8216() < 0) {
            return ((AbstractC0152i) obj).b();
        }
        return 0;
    }

    /* renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static void m9653(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            ((C0246g) obj).y((String) obj2);
        }
    }

    /* renamed from: ۡۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m9654(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((HBcms10Dou) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Buffer m9655(Object obj) {
        if (C0008.m1975() > 0) {
            return ((ByteBuffer) obj).flip();
        }
        return null;
    }

    /* renamed from: ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m9656(Object obj) {
        if (C0015.m3433() > 0) {
            return ((Callable) obj).call();
        }
        return null;
    }

    /* renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m9657(Object obj) {
        if (C0026.m4977() < 0) {
            return ((L) obj).e;
        }
        return null;
    }

    /* renamed from: ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m9658() {
        if (C0018.m3956() > 0) {
            return "=http";
        }
        return null;
    }

    /* renamed from: ۢۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9659() {
        return 319 ^ C0033.f631;
    }

    /* renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m9660(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m9661(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((U) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9662(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((com.github.catvod.spider.merge.H0.a) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9663(Object obj) {
        if (C0014.m3353() < 0) {
            return ((r) obj).g();
        }
        return 0;
    }

    /* renamed from: ۣۥۣ, reason: not valid java name and contains not printable characters */
    public static ImageButton m9664(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((q) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۦۦۨ, reason: not valid java name and contains not printable characters */
    public static long m9665(Object obj, Object obj2, long j) {
        if (C0052.m8320() > 0) {
            return ((JSONObject) obj).optLong((String) obj2, j);
        }
        return 0L;
    }

    /* renamed from: ۣۨۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m9666(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0254o) obj).o;
        }
        return null;
    }

    /* renamed from: ۤ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m9667(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0050.m8121() <= 0) {
            return ((HByingSo) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9668(Object obj) {
        if (C0043.m7332() > 0) {
            return com.github.catvod.spider.merge.W.v.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9669(Object obj) {
        if (C0014.m3353() < 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).P();
        }
        return null;
    }

    /* renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m9670(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.M0.f) obj).a;
        }
        return null;
    }

    /* renamed from: ۥ۠ۦۡ, reason: contains not printable characters */
    public static boolean m9671(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((h) obj).a;
        }
        return false;
    }

    /* renamed from: ۥۡ۟ۦ, reason: contains not printable characters */
    public static Object[] m9672(Object obj) {
        if (C0053.m8389() >= 0) {
            return Bili.proxy((Map) obj);
        }
        return null;
    }

    /* renamed from: ۥۡۧۥ, reason: contains not printable characters */
    public static boolean m9673(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((l) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۥۡۨۦ, reason: contains not printable characters */
    public static TextDirectionHeuristic m9674(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((PrecomputedText.Params) obj).getTextDirection();
        }
        return null;
    }

    /* renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static String m9675(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0017.m3633() < 0) {
            return ((HBrenren) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۥۥۤ, reason: contains not printable characters */
    public static k m9676(Object obj) {
        if (C0051.m8216() < 0) {
            return ((C0166x) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۦۡۢ, reason: contains not printable characters */
    public static String m9677(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((HBrren) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۧۢۤ, reason: contains not printable characters */
    public static Comparator m9678() {
        if (C0049.m8038() < 0) {
            return n.h;
        }
        return null;
    }

    /* renamed from: ۦۣ۟ۢ, reason: contains not printable characters */
    public static int m9679(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((TextView) obj).getMaxLines();
        }
        return 0;
    }

    /* renamed from: ۦ۟ۤۦ, reason: contains not printable characters */
    public static Charset m9680() {
        if (C0001.m1164() <= 0) {
            return StandardCharsets.UTF_16;
        }
        return null;
    }

    /* renamed from: ۦ۟ۥۨ, reason: contains not printable characters */
    public static boolean m9681(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((C0273c) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۦ۠۠ۦ, reason: contains not printable characters */
    public static IntBuffer m9682(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((IntBuffer) obj).put((IntBuffer) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۢ, reason: contains not printable characters */
    public static SecretKeySpec m9683() {
        if (C0050.m8121() <= 0) {
            return FishHxq.e;
        }
        return null;
    }

    /* renamed from: ۦۡ۟۠, reason: contains not printable characters */
    public static boolean m9684(Object obj, int i) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).e(i);
        }
        return false;
    }

    /* renamed from: ۦۤۤۥ, reason: contains not printable characters */
    public static boolean m9685(Object obj, boolean z) {
        if (C0058.m9131() <= 0) {
            return ((Future) obj).cancel(z);
        }
        return false;
    }

    /* renamed from: ۦۥۥ۟, reason: contains not printable characters */
    public static boolean m9686(Object obj, Object obj2) {
        if (m9659() <= 0) {
            return ((String) obj).matches((String) obj2);
        }
        return false;
    }

    /* renamed from: ۦۥۧۢ, reason: contains not printable characters */
    public static String m9687() {
        if (C0055.m8740() > 0) {
            return "大家都在.*";
        }
        return null;
    }

    /* renamed from: ۧ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9688(Object obj) {
        if (C0037.m6350() < 0) {
            ((Calendar) obj).clear();
        }
    }

    /* renamed from: ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m9689(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((DialogInterfaceOnClickListenerC0329i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.r m9690(Object obj) {
        if (C0012.m3024() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).j();
        }
        return null;
    }

    /* renamed from: ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.d m9691(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if (C0034.m6048() < 0) {
            return ((com.github.catvod.spider.merge.F0.L) obj).c((com.github.catvod.spider.merge.G0.b) obj2, (com.github.catvod.spider.merge.G0.d) obj3, i, (com.github.catvod.spider.merge.G0.d) obj4);
        }
        return null;
    }

    /* renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m9692(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((C0340u) obj).f;
        }
        return null;
    }

    /* renamed from: ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m9693(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.H0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m9694(Object obj) {
        if (C0038.m6471() > 0) {
            return ((ListIterator) obj).previous();
        }
        return null;
    }

    /* renamed from: ۨ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m9695(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.E0.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9696(Object obj) {
        if (C0041.m6823() <= 0) {
            ((com.github.catvod.spider.merge.U.n) obj).d();
        }
    }

    /* renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9697(Object obj) {
        if (C0025.m4797() > 0) {
            return ((M) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static void m9698(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).k((String) obj2);
        }
    }

    /* renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9699(Object obj) {
        if (C0035.m6140() < 0) {
            return ((AccessibilityNodeInfo.TouchDelegateInfo) obj).getRegionCount();
        }
        return 0;
    }

    /* renamed from: ۟۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9599(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}