package com.github.catvod.spider.merge.v;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.Toast;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0149f;
import com.github.catvod.spider.merge.F0.C0162t;
import com.github.catvod.spider.merge.F0.h0;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.p;
import com.github.catvod.spider.merge.P0.r;
import com.github.catvod.spider.merge.P0.w;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0228d;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0237F;
import com.github.catvod.spider.merge.a0.RunnableC0255p;
import com.github.catvod.spider.merge.a0.U;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0275e;
import com.github.catvod.spider.merge.e.C0276f;
import com.github.catvod.spider.merge.e.C0278h;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0307b;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.i.C0344d;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.URLDecoder;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.v.۟ۧۢۤ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0062 {

    /* renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int f863 = -823;

    /* renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m9370() {
        if (C0060.m9355() > 0) {
            return ";json;";
        }
        return null;
    }

    /* renamed from: ۟۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m9371(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            ((WebView) obj).setWebChromeClient((WebChromeClient) obj2);
        }
    }

    /* renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m9372(Object obj) {
        if (C0045.m7538() < 0) {
            return ((MYzhiqiu) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9373(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).V;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m9374(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            ((C0254o) obj).v((String) obj2);
        }
    }

    /* renamed from: ۟۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m9375(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9376(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((C) obj).g();
        }
        return false;
    }

    /* renamed from: ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m9377(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((C0276f) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0259u m9378(Object obj) {
        if (C0004.m1557() < 0) {
            return ((RunnableC0255p) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static void m9379(Object obj) {
        if (C0059.m9257() < 0) {
            ((Toast) obj).show();
        }
    }

    /* renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m9380() {
        if (C0059.m9257() <= 0) {
            return ".*?\\$(.*?)#.*";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m9381(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((m) obj).C();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static void m9382(Object obj) {
        if (C0010.m2320() < 0) {
            ((ThreadLocal) obj).remove();
        }
    }

    /* renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m9383() {
        if (C0030.m5375() > 0) {
            return "验证成功！";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9384(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0050.m8121() <= 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static r m9385(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m9386(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            ((Display) obj).getMetrics((DisplayMetrics) obj2);
        }
    }

    /* renamed from: ۣ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9387(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((com.github.catvod.spider.merge.T0.b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m9388() {
        if (C0047.m7837() > 0) {
            return "\\&财经.*?其他";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static j m9390(Object obj) {
        if (C0038.m6471() >= 0) {
            return M.j((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m9391(Object obj) {
        if (C0060.m9355() > 0) {
            return ((U) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m9392() {
        if (C0044.m7508() <= 0) {
            return "{by}";
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m9393(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0275e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m9394(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((StackTraceElement) obj).getClassName();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9395(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((ServerSocket) obj).isClosed();
        }
        return false;
    }

    /* renamed from: ۟ۥ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9396(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((com.github.catvod.spider.merge.V.b) obj).init((Context) obj2);
        }
    }

    /* renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9397(Object obj) {
        if (C0025.m4797() > 0) {
            return AbstractC0376b.h(obj);
        }
        return false;
    }

    /* renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9398(Object obj) {
        if (C0011.m2755() > 0) {
            return ((h0) obj).j;
        }
        return false;
    }

    /* renamed from: ۟ۥۦۨۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9399(Object obj, char c) {
        if (C0024.m4693() <= 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Boolean m9400(Object obj) {
        if (C0034.m6048() < 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).m();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static View m9401(Object obj) {
        if (C0028.m5152() <= 0) {
            return C0302e.f((View) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m9402(Object obj) {
        if (C0038.m6471() >= 0) {
            ((HashMap) obj).clear();
        }
    }

    /* renamed from: ۟ۦۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9403(Object obj, Object obj2, float f) {
        if (C0060.m9355() > 0) {
            ((Outline) obj).setRoundRect((Rect) obj2, f);
        }
    }

    /* renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m9404(Object obj) {
        if (C0043.m7332() > 0) {
            return ((JSDemo) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9405(Object obj) {
        if (C0020.m4210() < 0) {
            return ((w) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9406(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((h) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m9407(Object obj) {
        if (C0056.m8886() < 0) {
            ((C0174a) obj).y();
        }
    }

    /* renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m9408(Object obj, Object obj2, int i) {
        if (C0024.m4693() <= 0) {
            return ((C0149f) obj).a((char[]) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m9409(Object obj) {
        if (C0053.m8389() >= 0) {
            ((WebView) obj).destroy();
        }
    }

    /* renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static int m9410(Object obj) {
        if (C0009.m2047() > 0) {
            return ((C0148e) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m9411(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9412(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return ((Matcher) obj).replaceFirst((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9413(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((C0344d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String[] m9414(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((DateFormatSymbols) obj).getWeekdays();
        }
        return null;
    }

    /* renamed from: ۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m9415(Object obj) {
        if (C0061.m9359() < 0) {
            return ((HBDmSou) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9416(Object obj) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.e0.C) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9417(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0020.m4210() <= 0) {
            return ((n) obj).c((ArrayList) obj2, (String) obj3, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: ۡۢۦۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9418(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((P) obj).h;
        }
        return null;
    }

    /* renamed from: ۡۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m9419(Object obj) {
        if (C0010.m2320() < 0) {
            return ((NG.DtIt) obj).c;
        }
        return null;
    }

    /* renamed from: ۡۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m9420(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.merge.T0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m9421(Object obj) {
        if (C0051.m8216() <= 0) {
            return URLDecoder.decode((String) obj);
        }
        return null;
    }

    /* renamed from: ۡۥۦۨ, reason: not valid java name and contains not printable characters */
    public static String m9422(Object obj) {
        if (C0006.m1726() < 0) {
            return ((Matcher) obj).group();
        }
        return null;
    }

    /* renamed from: ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m9423(Object obj, Object obj2, Object obj3) {
        if (C0010.m2320() <= 0) {
            return g.q((ArrayList) obj, (ArrayList) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۡۧۥۡ, reason: not valid java name and contains not printable characters */
    public static Serializable m9424(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((h) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m9425() {
        if (C0011.m2755() > 0) {
            return com.github.catvod.spider.merge.g0.g.a;
        }
        return null;
    }

    /* renamed from: ۢۥۨۧ, reason: not valid java name and contains not printable characters */
    public static int m9426(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).g;
        }
        return 0;
    }

    /* renamed from: ۢۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9427(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((ComponentName) obj).getClassName();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m9428(String str) {
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

    /* renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9429() {
        return (-517) ^ C0020.f460;
    }

    /* renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static C0254o m9430(Object obj) {
        if (C0040.m6582() > 0) {
            return ((RunnableC0237F) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m9431(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m9432() {
        if (C0012.m3024() > 0) {
            return "电影--中国大陆&中国香港&中国台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大&其他||连续剧--中国大陆&中国香港&中国台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大&其他||综艺--中国大陆&中国香港&中国台湾&日本&韩国&美国&英国&其他||动漫--中国大陆&日本&韩国&美国&英国&法国&其他||纪录片--中国大陆&中国香港&中国台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大&其他||通用--中国大陆&中国香港&中国台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大&其他";
        }
        return null;
    }

    /* renamed from: ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9433(Object obj, boolean z, int i, Object obj2, int i2, int i3) {
        if (C0024.m4693() <= 0) {
            return ((String) obj).regionMatches(z, i, (String) obj2, i2, i3);
        }
        return false;
    }

    /* renamed from: ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m9434() {
        if (C0044.m7508() < 0) {
            return AbstractC0307b.a;
        }
        return null;
    }

    /* renamed from: ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m9435() {
        if (C0060.m9355() > 0) {
            return "剧集";
        }
        return null;
    }

    /* renamed from: ۥۢۧ, reason: contains not printable characters */
    public static int m9436(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0162t) obj).b;
        }
        return 0;
    }

    /* renamed from: ۦ۟ۦ, reason: contains not printable characters */
    public static Serializable m9437(Object obj) {
        if (C0031.m5628() > 0) {
            return ((C0246g) obj).f;
        }
        return null;
    }

    /* renamed from: ۦ۠ۢۦ, reason: contains not printable characters */
    public static String m9438(Object obj) {
        if (C0012.m3024() >= 0) {
            return HBCupfox.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۤۡ۠, reason: contains not printable characters */
    public static String m9439() {
        if (C0002.m1242() > 0) {
            return "mac";
        }
        return null;
    }

    /* renamed from: ۦۤۡۢ, reason: contains not printable characters */
    public static String m9440(Object obj) {
        if (C0001.m1164() <= 0) {
            return e.u((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۧۡۦ, reason: contains not printable characters */
    public static CheckBox m9441(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((C0228d) obj).e;
        }
        return null;
    }

    /* renamed from: ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m9442(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((C0278h) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m9443(Object obj) {
        if (C0031.m5628() > 0) {
            return ((FishHxq) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۦۢۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m9444(Object obj) {
        if (C0034.m6048() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).k0;
        }
        return null;
    }

    /* renamed from: ۨ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.e m9445(Object obj, Object obj2) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.e) obj).d((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۦۨ, reason: not valid java name and contains not printable characters */
    public static Activity m9446(Object obj) {
        if (C0041.m6823() < 0) {
            return ((C0288g) obj).c();
        }
        return null;
    }

    /* renamed from: ۨۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m9447() {
        if (C0015.m3433() >= 0) {
            return "筛选子分类名称";
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9389(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}