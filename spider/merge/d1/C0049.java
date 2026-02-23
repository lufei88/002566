package com.github.catvod.spider.merge.d1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.Binder;
import android.os.Environment;
import android.os.IInterface;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationController;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.github.catvod.spider.AList;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.HBdiDuan;
import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.merge-xbpq.Q.e0;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E0.c;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.InterfaceC0167y;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.V;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.b;
import com.github.catvod.spider.merge.G0.d;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.C0186g;
import com.github.catvod.spider.merge.U0.C0198m;
import com.github.catvod.spider.merge.U0.H;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.f;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.j;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0247h;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.e0.C0286e;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.ViewOnClickListenerC0299b;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.i.C0345e;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.R.e;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.d1.۟۠۠ۥۣ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0049 {

    /* renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int f770 = -372;

    /* renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7974(Object obj, int i, int i2, int i3, int i4) {
        if (C0028.m5152() < 0) {
            ((g) obj).i(i, i2, i3, i4);
        }
    }

    /* renamed from: ۟۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7975(Object obj) {
        if (C0019.m4065() <= 0) {
            ((Throwable) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static Object[] m7976(Object obj) {
        if (C0061.m9359() <= 0) {
            return j.d((Map) obj);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m7977() {
        if (C0009.m2047() >= 0) {
            return "SHeaders";
        }
        return null;
    }

    /* renamed from: ۟۠۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m7978(String str) {
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
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۟۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7979(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((C0176b) obj).g((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static URI m7980(Object obj) {
        if (C0019.m4065() < 0) {
            return URI.create((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7981() {
        if (C0012.m3024() > 0) {
            return "&";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m7982(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            ((l) obj).d((String) obj2);
        }
    }

    /* renamed from: ۟ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m7983(Object obj, int i) {
        if (C0059.m9257() <= 0) {
            return ((AdapterView) obj).getItemAtPosition(i);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7984() {
        if (C0053.m8389() >= 0) {
            return "v";
        }
        return null;
    }

    /* renamed from: ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static File m7985() {
        if (C0051.m8216() <= 0) {
            return Environment.getExternalStorageDirectory();
        }
        return null;
    }

    /* renamed from: ۟ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7986(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0174a) obj).j;
        }
        return 0;
    }

    /* renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static d m7987(Object obj) {
        if (C0041.m6823() < 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static e m7988() {
        if (C0021.m4379() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.Q.l.c;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static Future m7989(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            return ((ExecutorCompletionService) obj).submit((Callable) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7990(Object obj) {
        if (C0050.m8121() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Matcher m7991(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() <= 0) {
            return ((Matcher) obj).appendReplacement((StringBuffer) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m7992(Object obj, int i) {
        if (C0009.m2047() >= 0) {
            return ((GnssStatus) obj).getSvid(i);
        }
        return 0;
    }

    /* renamed from: ۟ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m7993(Object obj, Object obj2, Object obj3) {
        if (C0043.m7332() > 0) {
            ((Binder) obj).attachInterface((IInterface) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7994(Object obj) {
        if (C0045.m7538() < 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* renamed from: ۟ۢۦۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7995(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۢۨۥۢ, reason: not valid java name and contains not printable characters */
    public static int m7996(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((WindowInsets) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static H m7997(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((P) obj).n;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static RectF m7998(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((C0286e) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m7999(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return com.github.catvod.spider.merge.M0.d.f((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m8000(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((Uri.Builder) obj).authority((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8001(Object obj) {
        if (C0005.m1599() < 0) {
            return ((C0345e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Z.e m8002() {
        if (C0004.m1557() <= 0) {
            return f.d;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Class m8003() {
        if (C0059.m9257() < 0) {
            return Character.TYPE;
        }
        return null;
    }

    /* renamed from: ۟ۥۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8004(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((com.github.catvod.spider.merge.Z.d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8005(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((ProgressBar) obj).getProgress();
        }
        return 0;
    }

    /* renamed from: ۟ۦ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8006(Object obj) {
        if (C0056.m8886() < 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۦۡۨۡ, reason: not valid java name and contains not printable characters */
    public static C0254o m8008(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((RunnableC0247h) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8009(Object obj, Object obj2, int i, int i2) {
        if (C0014.m3353() <= 0) {
            return ((BufferedInputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8010(Object obj) {
        if (C0032.m5686() < 0) {
            return ((p) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static V[] m8011(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((C0144a) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0186g m8012() {
        if (C0008.m1975() >= 0) {
            return B.n;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static Pattern m8013(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).n;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8014(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() <= 0) {
            ((CookieManager) obj).setCookie((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8015(Object obj) {
        if (C0034.m6048() < 0) {
            return ((InterfaceC0167y) obj).b();
        }
        return false;
    }

    /* renamed from: ۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m8016(Object obj) {
        if (C0058.m9131() < 0) {
            return ((Q) obj).h();
        }
        return 0;
    }

    /* renamed from: ۟ۧۧۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8017(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۧۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8018(Object obj) {
        if (C0045.m7538() < 0) {
            return ((com.github.catvod.spider.merge.U.b) obj).a;
        }
        return false;
    }

    /* renamed from: ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8019(Object obj) {
        if (C0050.m8121() < 0) {
            return ((M) obj).n;
        }
        return null;
    }

    /* renamed from: ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m8020(Object obj, Object obj2, Object obj3) {
        if (C0017.m3633() < 0) {
            return ((HBdiDuan) obj).a((h) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m8021(Object obj) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).F;
        }
        return null;
    }

    /* renamed from: ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Insets m8022(Object obj) {
        if (C0008.m1975() > 0) {
            return ((WindowInsetsAnimationController) obj).getHiddenStateInsets();
        }
        return null;
    }

    /* renamed from: ۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m8023(Object obj, Object obj2, Object obj3) {
        if (C0045.m7538() <= 0) {
            return ((com.github.catvod.spider.merge.l0.g) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static List m8024(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((ShortcutManager) obj).getManifestShortcuts();
        }
        return null;
    }

    /* renamed from: ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m8025(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            ((PrintStream) obj).println(obj2);
        }
    }

    /* renamed from: ۡۦۨۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8026(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0144a) obj).b;
        }
        return null;
    }

    /* renamed from: ۢ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8027(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).d0();
        }
        return null;
    }

    /* renamed from: ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m8028(Object obj) {
        if (C0018.m3956() >= 0) {
            ((A) obj).p();
        }
    }

    /* renamed from: ۢۢۤۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m8029(Object obj, int i, Object obj2) {
        if (C0051.m8216() < 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton(i, (DialogInterface.OnClickListener) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m8030(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((Class) obj).getCanonicalName();
        }
        return null;
    }

    /* renamed from: ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8031(Object obj, float f, float f2, float f3, Object obj2) {
        if (C0005.m1599() < 0) {
            ((Canvas) obj).drawCircle(f, f2, f3, (Paint) obj2);
        }
    }

    /* renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8032(Object obj, int i) {
        if (C0050.m8121() < 0) {
            return ((SparseLongArray) obj).keyAt(i);
        }
        return 0;
    }

    /* renamed from: ۣۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m8033(Object obj, boolean z) {
        if (C0057.m9017() >= 0) {
            ((WebView) obj).clearCache(z);
        }
    }

    /* renamed from: ۤ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static EditText m8034(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((C0340u) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m8035(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((JSONObject) obj).opt((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m8036(Object obj) {
        if (C0014.m3353() < 0) {
            return ApplvDV2.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8037(Object obj, int i) {
        if (C0011.m2755() >= 0) {
            ((DrawableContainer) obj).setEnterFadeDuration(i);
        }
    }

    /* renamed from: ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m8038() {
        return 1021 ^ C0047.f763;
    }

    /* renamed from: ۤۥۡ۟, reason: not valid java name and contains not printable characters */
    public static float m8039(Object obj) {
        if (C0046.m7701() > 0) {
            return ((C0315D) obj).i;
        }
        return 0.0f;
    }

    /* renamed from: ۤۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8040(Object obj, Object obj2, Object obj3) {
        if (C0041.m6823() <= 0) {
            return ((C0166x) obj).f((c) obj2, (d) obj3);
        }
        return 0;
    }

    /* renamed from: ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m8041(Object obj) {
        if (C0015.m3433() >= 0) {
            ((EditText) obj).selectAll();
        }
    }

    /* renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static Future m8042(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((ExecutorService) obj).submit((Callable) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۡۡ, reason: contains not printable characters */
    public static String m8043(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static void m8044(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            ((WebView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۥۦۨۢ, reason: contains not printable characters */
    public static String m8045(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۧ۠ۢ, reason: contains not printable characters */
    public static W m8046() {
        if (C0038.m6471() >= 0) {
            return com.github.catvod.spider.merge.a0.V.a;
        }
        return null;
    }

    /* renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static byte[] m8047(Object obj, int i) {
        if (C0046.m7701() > 0) {
            return Base64.encode((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۦۡ۠ۡ, reason: contains not printable characters */
    public static C0198m m8048() {
        if (C0046.m7701() > 0) {
            return B.a;
        }
        return null;
    }

    /* renamed from: ۦۢۢ, reason: contains not printable characters */
    public static ArrayList m8049(Object obj) {
        if (C0027.m5017() > 0) {
            return Wogg.b((h) obj);
        }
        return null;
    }

    /* renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static boolean m8050(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).c();
        }
        return false;
    }

    /* renamed from: ۦۥۤ, reason: contains not printable characters */
    public static List m8051(Object obj, Object obj2, boolean z) {
        if (C0035.m6140() < 0) {
            return ((AList) obj).d((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۦۧۡ۠, reason: contains not printable characters */
    public static e0[] m8052(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۨۤۨ, reason: contains not printable characters */
    public static List m8053(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((com.github.catvod.spider.merge.I.a) obj).d();
        }
        return null;
    }

    /* renamed from: ۦۨۦۥ, reason: contains not printable characters */
    public static boolean m8054(Object obj, Object obj2, Object obj3) {
        if (C0063.m9589() <= 0) {
            return ((d0) obj).c((s) obj2, (p) obj3);
        }
        return false;
    }

    /* renamed from: ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m8055(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.f) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m8056(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ImageDecoder.decodeDrawable((ImageDecoder.Source) obj, (ImageDecoder.OnHeaderDecodedListener) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.K.a m8057(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C0259u) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8058(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.V0.d) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m8059(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((ViewOnClickListenerC0299b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۨۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8060(Object obj, int i) {
        if (C0060.m9355() >= 0) {
            ((BitSet) obj).set(i);
        }
    }

    /* renamed from: ۨۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m8061(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            ((f) obj).a((SSLSocket) obj2);
        }
    }

    /* renamed from: ۨۢۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8062(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((C0067a) obj).t();
        }
        return false;
    }

    /* renamed from: ۨۧۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8063(Object obj) {
        if (C0008.m1975() > 0) {
            return ((Bitmap) obj).hasMipMap();
        }
        return false;
    }

    /* renamed from: ۨۨۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8064(Object obj) {
        if (C0064.m9659() < 0) {
            return com.github.catvod.spider.merge.D.f.H((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8065(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.K.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m8007(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}