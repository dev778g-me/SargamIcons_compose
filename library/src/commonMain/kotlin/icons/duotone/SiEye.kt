package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiEye: ImageVector
    get() {
        if (_SiEye != null) {
            return _SiEye!!
        }
        _SiEye = ImageVector.Builder(
            name = "Duotone.SiEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 6f)
                curveToRelative(5.522f, 0f, 10f, 6f, 10f, 6f)
                reflectiveCurveToRelative(-4.478f, 6f, -10f, 6f)
                reflectiveCurveToRelative(-10f, -6f, -10f, -6f)
                reflectiveCurveToRelative(4.478f, -6f, 10f, -6f)
                moveToRelative(0f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                reflectiveCurveToRelative(-4.478f, 6f, -10f, 6f)
                reflectiveCurveToRelative(-10f, -6f, -10f, -6f)
                reflectiveCurveToRelative(4.478f, -6f, 10f, -6f)
                reflectiveCurveToRelative(10f, 6f, 10f, 6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            }
        }.build()

        return _SiEye!!
    }

@Suppress("ObjectPropertyName")
private var _SiEye: ImageVector? = null
