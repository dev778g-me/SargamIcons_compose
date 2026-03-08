package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiKey: ImageVector
    get() {
        if (_SiKey != null) {
            return _SiKey!!
        }
        _SiKey = ImageVector.Builder(
            name = "Filled.SiKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 2f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.716f, 13.786f)
                lineTo(7.946f, 21.13f)
                arcToRelative(2.993f, 2.993f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.231f, 0f)
                lineToRelative(-1.422f, -1.422f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(1.458f, -1.458f)
                lineToRelative(0.132f, -0.111f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.477f, -0.177f)
                lineToRelative(1.051f, -0.105f)
                lineToRelative(0.132f, -1.096f)
                lineToRelative(0.034f, -0.167f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.84f, -0.707f)
                lineToRelative(1.112f, -0.135f)
                lineToRelative(0.135f, -1.113f)
                lineToRelative(0.033f, -0.164f)
                curveToRelative(0.047f, -0.159f, 0.135f, -0.305f, 0.253f, -0.424f)
                lineToRelative(0.697f, -0.697f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 2f)
                moveToRelative(0f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            }
        }.build()

        return _SiKey!!
    }

@Suppress("ObjectPropertyName")
private var _SiKey: ImageVector? = null
