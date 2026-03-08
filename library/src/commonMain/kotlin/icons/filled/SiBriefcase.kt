package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBriefcase: ImageVector
    get() {
        if (_SiBriefcase != null) {
            return _SiBriefcase!!
        }
        _SiBriefcase = ImageVector.Builder(
            name = "Filled.SiBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 7f)
                lineTo(4.4f, 7f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.4f)
                verticalLineToRelative(9.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 21f)
                horizontalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                lineTo(22f, 9.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.6f, 7f)
                lineTo(16f, 7f)
                lineTo(16f, 4.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.2f, 3f)
                lineTo(9.8f, 3f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4.8f)
                close()
                moveTo(10f, 7f)
                lineTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 8f)
                verticalLineToRelative(12f)
                lineTo(8f, 20f)
                lineTo(8f, 8f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 8f)
                close()
            }
        }.build()

        return _SiBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _SiBriefcase: ImageVector? = null
