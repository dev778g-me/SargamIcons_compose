package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiVerified: ImageVector
    get() {
        if (_SiVerified != null) {
            return _SiVerified!!
        }
        _SiVerified = ImageVector.Builder(
            name = "Duotone.SiVerified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, -1.395f, -0.858f, -2.605f, -2.137f, -3.259f)
                curveToRelative(0.45f, -1.356f, 0.195f, -2.829f, -0.79f, -3.814f)
                curveToRelative(-0.985f, -0.986f, -2.458f, -1.24f, -3.815f, -0.79f)
                curveTo(14.615f, 2.859f, 13.396f, 2f, 12f, 2f)
                reflectiveCurveToRelative(-2.605f, 0.859f, -3.249f, 2.137f)
                curveToRelative(-1.366f, -0.45f, -2.839f, -0.196f, -3.824f, 0.79f)
                curveToRelative(-0.986f, 0.985f, -1.23f, 2.458f, -0.78f, 3.814f)
                curveTo(2.867f, 9.395f, 2f, 10.605f, 2f, 12f)
                reflectiveCurveToRelative(0.868f, 2.605f, 2.146f, 3.258f)
                curveToRelative(-0.448f, 1.357f, -0.205f, 2.83f, 0.78f, 3.815f)
                curveToRelative(0.986f, 0.985f, 2.46f, 1.23f, 3.815f, 0.79f)
                curveTo(9.395f, 21.142f, 10.605f, 22f, 12f, 22f)
                reflectiveCurveToRelative(2.615f, -0.858f, 3.258f, -2.137f)
                curveToRelative(1.357f, 0.44f, 2.83f, 0.195f, 3.815f, -0.79f)
                reflectiveCurveToRelative(1.24f, -2.458f, 0.79f, -3.815f)
                curveTo(21.142f, 14.606f, 22f, 13.396f, 22f, 12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(8f, 13f)
                lineToRelative(3f, 3f)
                lineToRelative(5f, -7f)
                moveToRelative(6f, 3f)
                curveToRelative(0f, -1.395f, -0.858f, -2.605f, -2.137f, -3.259f)
                curveToRelative(0.45f, -1.356f, 0.195f, -2.829f, -0.79f, -3.814f)
                curveToRelative(-0.985f, -0.986f, -2.458f, -1.24f, -3.815f, -0.79f)
                curveTo(14.615f, 2.859f, 13.396f, 2f, 12f, 2f)
                reflectiveCurveToRelative(-2.605f, 0.859f, -3.249f, 2.137f)
                curveToRelative(-1.366f, -0.45f, -2.839f, -0.196f, -3.824f, 0.79f)
                curveToRelative(-0.986f, 0.985f, -1.23f, 2.458f, -0.78f, 3.814f)
                curveTo(2.867f, 9.395f, 2f, 10.605f, 2f, 12f)
                reflectiveCurveToRelative(0.868f, 2.605f, 2.146f, 3.258f)
                curveToRelative(-0.448f, 1.357f, -0.205f, 2.83f, 0.78f, 3.815f)
                curveToRelative(0.986f, 0.985f, 2.46f, 1.23f, 3.815f, 0.79f)
                curveTo(9.395f, 21.142f, 10.605f, 22f, 12f, 22f)
                reflectiveCurveToRelative(2.615f, -0.858f, 3.258f, -2.137f)
                curveToRelative(1.357f, 0.44f, 2.83f, 0.195f, 3.815f, -0.79f)
                reflectiveCurveToRelative(1.24f, -2.458f, 0.79f, -3.815f)
                curveTo(21.142f, 14.606f, 22f, 13.396f, 22f, 12f)
            }
        }.build()

        return _SiVerified!!
    }

@Suppress("ObjectPropertyName")
private var _SiVerified: ImageVector? = null
