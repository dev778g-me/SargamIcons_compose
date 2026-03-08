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

val Sargam.Duotone.SiKey: ImageVector
    get() {
        if (_SiKey != null) {
            return _SiKey!!
        }
        _SiKey = ImageVector.Builder(
            name = "Duotone.SiKey",
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
                moveTo(15f, 3f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.001f, 11.658f)
                lineToRelative(-5.76f, 5.764f)
                arcToRelative(1.994f, 1.994f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.817f, 0f)
                lineTo(3f, 19f)
                lineToRelative(1.458f, -1.458f)
                lineToRelative(1.85f, -0.184f)
                lineToRelative(0.227f, -1.893f)
                lineToRelative(1.895f, -0.228f)
                lineToRelative(0.227f, -1.894f)
                lineToRelative(1.219f, -1.219f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 3f)
                moveToRelative(0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.124f, -2.876f)
                lineToRelative(-1.22f, 1.22f)
                lineToRelative(-0.226f, 1.893f)
                lineToRelative(-1.894f, 0.227f)
                lineToRelative(-0.228f, 1.894f)
                lineToRelative(-1.85f, 0.184f)
                lineTo(3f, 19f)
                lineToRelative(1.422f, 1.422f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.817f, 0f)
                lineToRelative(5.76f, -5.764f)
                curveToRelative(0.626f, 0.222f, 1.3f, 0.342f, 2.001f, 0.342f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
        }.build()

        return _SiKey!!
    }

@Suppress("ObjectPropertyName")
private var _SiKey: ImageVector? = null
