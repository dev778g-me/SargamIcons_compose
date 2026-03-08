package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSwatch: ImageVector
    get() {
        if (_SiSwatch != null) {
            return _SiSwatch!!
        }
        _SiSwatch = ImageVector.Builder(
            name = "Filled.SiSwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(2.313f)
                lineToRelative(1.9f, -1.899f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.657f, 5.657f)
                lineTo(15.627f, 14f)
                lineTo(18f, 14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.206f, 7.995f)
                lineTo(18f, 22f)
                lineTo(6f, 22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(2f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                moveToRelative(0f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                moveToRelative(3.628f, 4f)
                lineTo(18f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.204f, -3.99f)
                lineTo(18f, 16f)
                horizontalLineToRelative(-4.372f)
                close()
                moveTo(16.143f, 7.828f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(10f, 11.142f)
                verticalLineToRelative(5.657f)
                lineToRelative(2.5f, -2.501f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(3.633f, -3.63f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.83f)
            }
        }.build()

        return _SiSwatch!!
    }

@Suppress("ObjectPropertyName")
private var _SiSwatch: ImageVector? = null
