package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUserAlt: ImageVector
    get() {
        if (_SiUserAlt != null) {
            return _SiUserAlt!!
        }
        _SiUserAlt = ImageVector.Builder(
            name = "Duotone.SiUserAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(20.4f, 22f)
                horizontalLineTo(3.6f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.25f, 0f, -0.38f, 0.12f, -0.62f)
                curveToRelative(0.38f, -0.88f, 1.5f, -1.62f, 3.25f, -2.25f)
                curveToRelative(1.25f, 2.38f, 3.75f, 4f, 6.62f, 4f)
                reflectiveCurveToRelative(5.38f, -1.62f, 6.62f, -4f)
                curveToRelative(1.75f, 0.62f, 2.88f, 1.38f, 3.25f, 2.25f)
                curveToRelative(0.12f, 0.12f, 0.12f, 0.38f, 0.12f, 0.62f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.4f, 22f)
                horizontalLineTo(3.6f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.25f, 0f, -0.38f, 0.12f, -0.62f)
                curveToRelative(0.38f, -0.88f, 1.5f, -1.62f, 3.25f, -2.25f)
                curveToRelative(1.25f, 2.38f, 3.75f, 4f, 6.62f, 4f)
                reflectiveCurveToRelative(5.38f, -1.62f, 6.62f, -4f)
                curveToRelative(1.75f, 0.62f, 2.88f, 1.38f, 3.25f, 2.25f)
                curveToRelative(0.12f, 0.12f, 0.12f, 0.38f, 0.12f, 0.62f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.5f)
                curveToRelative(-2.75f, 0f, -5f, -2.25f, -5f, -5f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.75f, 2.25f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.25f, 5f, 5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.75f, -2.25f, 5f, -5f, 5f)
            }
        }.build()

        return _SiUserAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt: ImageVector? = null
