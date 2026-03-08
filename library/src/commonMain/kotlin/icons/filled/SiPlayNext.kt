package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPlayNext: ImageVector
    get() {
        if (_SiPlayNext != null) {
            return _SiPlayNext!!
        }
        _SiPlayNext = ImageVector.Builder(
            name = "Filled.SiPlayNext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.538f, 4.113f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.035f, 0.068f)
                lineToRelative(10f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.638f)
                lineToRelative(-10f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.538f, -0.887f)
                moveTo(16f, 5.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.8f, 4f)
                horizontalLineToRelative(1.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.8f)
                verticalLineToRelative(12.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, 1.8f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, -1.8f)
                close()
            }
        }.build()

        return _SiPlayNext!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayNext: ImageVector? = null
