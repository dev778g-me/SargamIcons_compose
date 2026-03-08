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

val Sargam.Duotone.SiHeartAlt: ImageVector
    get() {
        if (_SiHeartAlt != null) {
            return _SiHeartAlt!!
        }
        _SiHeartAlt = ImageVector.Builder(
            name = "Duotone.SiHeartAlt",
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
                moveTo(16.55f, 3.084f)
                arcToRelative(5.452f, 5.452f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.852f, 9.307f)
                lineToRelative(-0.648f, 0.654f)
                lineToRelative(-0.86f, 0.854f)
                lineToRelative(-6.852f, 6.852f)
                lineTo(5.19f, 13.9f)
                lineToRelative(-0.86f, -0.854f)
                lineToRelative(-0.648f, -0.654f)
                arcToRelative(5.453f, 5.453f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.706f, -7.712f)
                lineToRelative(0.654f, 0.654f)
                lineToRelative(0.655f, -0.654f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.852f, -1.595f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.55f, 3.084f)
                arcToRelative(5.452f, 5.452f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.852f, 9.307f)
                lineToRelative(-0.648f, 0.654f)
                lineToRelative(-0.86f, 0.854f)
                lineToRelative(-6.852f, 6.852f)
                lineTo(5.19f, 13.9f)
                lineToRelative(-0.86f, -0.854f)
                lineToRelative(-0.648f, -0.654f)
                arcToRelative(5.453f, 5.453f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.706f, -7.712f)
                lineToRelative(0.654f, 0.654f)
                lineToRelative(0.655f, -0.654f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.852f, -1.595f)
            }
        }.build()

        return _SiHeartAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiHeartAlt: ImageVector? = null
