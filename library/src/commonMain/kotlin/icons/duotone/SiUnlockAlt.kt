package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUnlockAlt: ImageVector
    get() {
        if (_SiUnlockAlt != null) {
            return _SiUnlockAlt!!
        }
        _SiUnlockAlt = ImageVector.Builder(
            name = "Duotone.SiUnlockAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f,
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f
            ) {
                moveTo(4.6f, 11f)
                horizontalLineToRelative(14.8f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(4f)
                moveTo(4.6f, 11f)
                horizontalLineToRelative(14.8f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                moveToRelative(8.4f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            }
        }.build()

        return _SiUnlockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnlockAlt: ImageVector? = null
