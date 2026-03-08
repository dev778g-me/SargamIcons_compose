package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAISearch: ImageVector
    get() {
        if (_SiAISearch != null) {
            return _SiAISearch!!
        }
        _SiAISearch = ImageVector.Builder(
            name = "Filled.SiAISearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.97f, 5.616f)
                lineToRelative(3.677f, 3.677f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-3.677f, -3.677f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 11f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.104f, 8.507f)
                curveToRelative(0.298f, -0.871f, 1.585f, -0.842f, 1.818f, 0.087f)
                lineToRelative(0.296f, 1.188f)
                lineToRelative(1.188f, 0.297f)
                curveToRelative(0.96f, 0.24f, 0.96f, 1.603f, 0f, 1.842f)
                lineToRelative(-1.188f, 0.297f)
                lineToRelative(-0.296f, 1.188f)
                curveToRelative(-0.24f, 0.96f, -1.603f, 0.96f, -1.843f, 0f)
                lineToRelative(-0.297f, -1.188f)
                lineToRelative(-1.188f, -0.296f)
                curveToRelative(-0.96f, -0.24f, -0.96f, -1.603f, 0f, -1.843f)
                lineToRelative(1.188f, -0.297f)
                lineToRelative(0.297f, -1.188f)
                close()
                moveTo(11f, 10.797f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.203f, -0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.203f, -0.203f)
            }
        }.build()

        return _SiAISearch!!
    }

@Suppress("ObjectPropertyName")
private var _SiAISearch: ImageVector? = null
