package com.github.catvod.spider.merge.T0;

import android.app.AlertDialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.core.view.MenuHostHelper;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HB4kav;
import com.github.catvod.spider.HBAppfox;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.HBmp4;
import com.github.catvod.spider.HBqiJi;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.Jianpian;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.YunPanBa;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.RunnableC0225a;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.AsyncTaskC0251l;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0250k;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0278h;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AbstractC0339t;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.K;
import com.github.catvod.spider.merge.h0.RunnableC0325e;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.n0.C0355a;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.v.C0375a;
import com.github.catvod.spider.merge.w.C0400d;
import com.github.catvod.spider.merge.x0.AbstractC0412b;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.C;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URL;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.T0.۟۟ۨۦۨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0030 {

    /* renamed from: ۟۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static int f514 = -607;

    /* renamed from: ۟۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static List m5329(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).s;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m5330(Object obj) {
        if (C0027.m5017() > 0) {
            return ((MYzhiqiu) obj).b();
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.h.e m5331() {
        if (C0002.m1242() > 0) {
            return com.github.catvod.spider.p000mergexbpq.h.e.a;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static C0144a m5332(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((com.github.catvod.spider.merge.E0.s) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.d m5333(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((m) obj).M((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5334(String str) {
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

    /* renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5335(Object obj) {
        if (C0023.m4566() < 0) {
            return ((URL) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5336(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((AccessibilityNodeInfo) obj).removeChild((View) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m5337(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((HB4kav) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5338(Object obj) {
        if (C0009.m2047() > 0) {
            return ((InterfaceC0416b) obj).isAbstract();
        }
        return false;
    }

    /* renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m5339(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۡۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m5340(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((WindowInsets) obj).getStableInsetTop();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5341(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((C0375a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m5342(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).i((D) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m5343(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.F.j) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5344(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((r) obj).f();
        }
        return 0;
    }

    /* renamed from: ۟ۢ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5345(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0052.m8320() > 0) {
            return ((HBmp4) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int m5346(Object obj) {
        if (C0034.m6048() < 0) {
            return ((Insets) obj).top;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m5347(Object obj, int i, int i2) {
        if (C0039.m6529() <= 0) {
            ((SparseIntArray) obj).put(i, i2);
        }
    }

    /* renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5348(Object obj, int i) {
        if (C0014.m3353() <= 0) {
            ((View) obj).setMinimumHeight(i);
        }
    }

    /* renamed from: ۟ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m5349(Object obj) {
        if (C0054.m8557() < 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۢۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5350() {
        if (C0033.m5872() >= 0) {
            return "homeContent";
        }
        return null;
    }

    /* renamed from: ۟ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static String m5351(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((Cloud) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5352(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            ((C0253n) obj).g((String) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m5353(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).Y();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static Runnable m5354(Object obj) {
        if (C0025.m4797() > 0) {
            return ((HBleiJing) obj).showdig();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5355(Object obj) {
        if (C0005.m1599() <= 0) {
            ((x) obj).f();
        }
    }

    /* renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5356() {
        if (C0000.m1116() < 0) {
            return "请求头";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Enumeration m5357(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((Hashtable) obj).keys();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5358(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m5359(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.p) obj).q();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m5360(Object obj) {
        if (C0020.m4210() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.a) obj).b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static MenuHostHelper m5361(Object obj) {
        if (C0064.m9659() < 0) {
            return ((C0400d) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m5363() {
        if (C0058.m9131() < 0) {
            return YunPanBa.a();
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5364(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.H0.e) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5365() {
        if (C0032.m5686() <= 0) {
            return "跳转中";
        }
        return null;
    }

    /* renamed from: ۟ۤۤۨ۟, reason: not valid java name and contains not printable characters */
    public static float m5366(Object obj) {
        if (C0027.m5017() > 0) {
            return ((MotionEvent) obj).getRawY();
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge-xbpq.R.e, com.github.catvod.spider.merge-xbpq.R.e>] */
    /* renamed from: ۟ۤۨۤۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m5367(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦ۠, reason: not valid java name and contains not printable characters */
    public static List m5368(Object obj) {
        if (m5375() >= 0) {
            return ((NG.DtIt) obj).getVideoInfo();
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m5369(Object obj, int i) {
        if (C0047.m7837() > 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginStart(i);
        }
    }

    /* renamed from: ۟ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static String m5370(Object obj, Object obj2, Object obj3, boolean z) {
        if (m5375() >= 0) {
            return ((HBv1Class) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟ۥۤۦۣ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5371(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((StringBuilder) obj).reverse();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String[] m5372() {
        if (C0046.m7701() >= 0) {
            return C0176b.z;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m5373(Object obj) {
        if (C0013.m3167() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.c.d.e((com.github.catvod.spider.p000mergexbpq.c.g) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m5374(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            return ((ConcurrentHashMap) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m5375() {
        return 706 ^ C0042.f734;
    }

    /* renamed from: ۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5376() {
        if (C0036.m6252() >= 0) {
            return "......";
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Spinner m5377(Object obj) {
        if (C0038.m6471() > 0) {
            return ((K) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5378() {
        if (C0050.m8121() <= 0) {
            return "dtFromName";
        }
        return null;
    }

    /* renamed from: ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5379(Object obj) {
        if (C0033.m5872() > 0) {
            return ((MYzhiqiu) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5380(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((Notification) obj).color;
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static Uri m5381(Object obj) {
        if (C0004.m1557() <= 0) {
            return Uri.fromFile((File) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5382(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0056.m8886() <= 0) {
            return ((HBqiJi) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥۦ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m5383(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((Charset) obj).newEncoder();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String m5384(Object obj) {
        if (C0058.m9131() < 0) {
            return ((W) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Exception m5385(Object obj) {
        if (C0057.m9017() > 0) {
            return ((C0355a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5386() {
        if (m5375() > 0) {
            return "vod_play_from";
        }
        return null;
    }

    /* renamed from: ۟ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m5387(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0011.m2755() >= 0) {
            ((com.github.catvod.spider.merge.N0.b) obj).d((StringBuffer) obj2, (String) obj3, (Collection) obj4);
        }
    }

    /* renamed from: ۟ۧۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m5388(Object obj, Object obj2, int i) {
        if (C0043.m7332() >= 0) {
            return ((String) obj).indexOf((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5389(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).c();
        }
        return null;
    }

    /* renamed from: ۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5390(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            com.github.catvod.spider.merge.D.f.M((List) obj, (String) obj2);
        }
    }

    /* renamed from: ۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5391(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            ((C0335o) obj).g((String) obj2);
        }
    }

    /* renamed from: ۠ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0340u m5392() {
        if (C0031.m5628() > 0) {
            return AbstractC0339t.a;
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.W.h m5393(Object obj) {
        if (C0001.m1164() < 0) {
            return ((RunnableC0225a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m5394(Object obj) {
        if (C0034.m6048() <= 0) {
            ((Market) obj).c();
        }
    }

    /* renamed from: ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m5395() {
        if (C0009.m2047() > 0) {
            return Jianpian.a();
        }
        return null;
    }

    /* renamed from: ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m5396(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((AbstractC0412b) obj).c;
        }
        return 0;
    }

    /* renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I.a m5397(Object obj) {
        if (C0042.m7147() < 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).d();
        }
        return null;
    }

    /* renamed from: ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5398() {
        if (C0004.m1557() < 0) {
            return "firstpage";
        }
        return null;
    }

    /* renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m5399(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.S.l) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static long m5400(Object obj) {
        if (C0036.m6252() >= 0) {
            return com.github.catvod.spider.merge.g0.e.c((File) obj);
        }
        return 0L;
    }

    /* renamed from: ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m5401(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C0253n) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static List m5402(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.Q.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static ImageView m5403(Object obj) {
        if (C0058.m9131() < 0) {
            return ((AsyncTaskC0251l) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Class m5404(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((Class) obj).getComponentType();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.X0.d m5405(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((A) obj).v();
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Icon m5406(Object obj, int i, int i2) {
        if (m5375() > 0) {
            return Icon.createWithData((byte[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m5407(Object obj, Object obj2) {
        if (C0042.m7147() < 0) {
            return ((com.github.catvod.spider.merge.X0.l) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5408() {
        if (C0021.m4379() >= 0) {
            return "\\&少年.*?其他";
        }
        return null;
    }

    /* renamed from: ۣۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m5409(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((JSONObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5410(Object obj) {
        if (C0035.m6140() < 0) {
            return ((WindowInsets) obj).isRound();
        }
        return false;
    }

    /* renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m5411(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0335o) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static int m5412(Object obj) {
        if (C0050.m8121() < 0) {
            return ((com.github.catvod.spider.merge.P0.D) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۥۥۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m5413(Object obj) {
        if (C0049.m8038() < 0) {
            return ((C0278h) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۤ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5414(Object obj) {
        if (C0000.m1116() < 0) {
            return ((Date) obj).getYear();
        }
        return 0;
    }

    /* renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.i m5415(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.merge.l0.k) obj).a();
        }
        return null;
    }

    /* renamed from: ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5416(Object obj, int i) {
        if (C0055.m8740() > 0) {
            return ((String) obj).lastIndexOf(i);
        }
        return 0;
    }

    /* renamed from: ۤۤۥ۠, reason: not valid java name and contains not printable characters */
    public static int m5417() {
        if (C0015.m3433() > 0) {
            return com.github.catvod.spider.merge.e1.d.a;
        }
        return 0;
    }

    /* renamed from: ۤۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m5418(Object obj) {
        if (C0048.m7971() > 0) {
            ((A) obj).o();
        }
    }

    /* renamed from: ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5419() {
        if (C0001.m1164() <= 0) {
            return "请检配置ext-->";
        }
        return null;
    }

    /* renamed from: ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5420(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((DialogInterfaceOnDismissListenerC0250k) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5421(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.G.d) obj).b();
        }
        return null;
    }

    /* renamed from: ۤۨۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5422(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((com.github.catvod.spider.merge.M.e) obj).d();
        }
        return null;
    }

    /* renamed from: ۥ۠ۤ۟, reason: contains not printable characters */
    public static String m5423() {
        if (C0005.m1599() < 0) {
            return "编码";
        }
        return null;
    }

    /* renamed from: ۥۢۢ۟, reason: contains not printable characters */
    public static int m5424(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((RunnableC0325e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static String m5425(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.D.a.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۤۦۡ, reason: contains not printable characters */
    public static void m5426(Object obj) throws InterruptedException {
        if (C0006.m1726() <= 0) {
            ((Thread) obj).join();
        }
    }

    /* renamed from: ۥۧۧۢ, reason: contains not printable characters */
    public static String m5427(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((FishHxq) obj).f((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۧۥ, reason: contains not printable characters */
    public static String m5428(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.I0.b) obj).getText();
        }
        return null;
    }

    /* renamed from: ۦۡ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.N.b m5429(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.N.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۢۢۦ, reason: contains not printable characters */
    public static void m5430() {
        if (C0058.m9131() <= 0) {
            com.github.catvod.spider.merge.a1.l.d();
        }
    }

    /* renamed from: ۦۢۤۤ, reason: contains not printable characters */
    public static String m5431(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0017.m3633() < 0) {
            return ((XBPQ) obj).encrypt((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۦۧۧۦ, reason: contains not printable characters */
    public static IntBuffer m5432(Object obj) {
        if (C0028.m5152() < 0) {
            return ((com.github.catvod.spider.merge.E0.a) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۨ, reason: contains not printable characters */
    public static String m5433(Object obj, Object obj2, Object obj3) {
        if (C0003.m1463() <= 0) {
            return com.github.catvod.spider.merge.g0.g.d((String) obj, (String) obj2, (Integer) obj3);
        }
        return null;
    }

    /* renamed from: ۧ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static ViewParent m5434(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((View) obj).getParent();
        }
        return null;
    }

    /* renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5435(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.V.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5436(Object obj, int i) {
        if (C0061.m9359() <= 0) {
            ((WebView) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۧۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5437() {
        if (C0022.m4497() > 0) {
            return "纪录片";
        }
        return null;
    }

    /* renamed from: ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m5438(Object obj) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.merge.b0.h) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static void m5439(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            com.github.catvod.spider.p000mergexbpq.b.p.c((com.github.catvod.spider.p000mergexbpq.b.p) obj, (EditText) obj2);
        }
    }

    /* renamed from: ۨۤۤۤ, reason: not valid java name and contains not printable characters */
    public static C m5440(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((E) obj).a();
        }
        return null;
    }

    /* renamed from: ۨۤۦۥ, reason: not valid java name and contains not printable characters */
    public static m m5441(Object obj) {
        if (C0010.m2320() < 0) {
            return ((l) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۥۧ۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m5442(Object obj, int i, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton(i, (DialogInterface.OnClickListener) obj2);
        }
        return null;
    }

    /* renamed from: ۨۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5443(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((C0254o) obj).i;
        }
        return null;
    }

    /* renamed from: ۨۧۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m5444(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.X0.m) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۦ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m5445() {
        if (C0004.m1557() <= 0) {
            return HBAppfox.b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String m5362(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}